package point4;
//aggregation

class circle {

	int square(int n) {
		return n * n;
	}
}

public class N1 {
	circle cl;
	double pi = 3.14;

	double area(int radius) {
		cl = new circle();
		int rsquare = cl.square(radius);
		return pi * rsquare;
	}

	public static void main(String args[]) {
		N1 c = new N1();
		double result = c.area(5);
		System.out.println(result);
	}

}

package point4;

class Bank2 {
	float getRateOfInterest() {
		return 0;
	}
}

class SBI2 extends Bank2 {
	float getRateOfInterest() {
		return 8.4f;
	}
}

class ICICI2 extends Bank2 {
	float getRateOfInterest() {
		return 7.3f;
	}
}

class AXIS2 extends Bank2 {
	float getRateOfInterest() {
		return 9.7f;
	}
}

public class N15 {
	public static void main(String args[]) {
		Bank2 b;
		b = new SBI2();
		System.out.println("SBI Rate of Interest: " + b.getRateOfInterest());
		b = new ICICI2();
		System.out.println("ICICI Rate of Interest: " + b.getRateOfInterest());
		b = new AXIS2();
		System.out.println("AXIS Rate of Interest: " + b.getRateOfInterest());
	}

}

package point4;

public class N2 {

	int id;
	String name;
	A2 address;

	public N2(int id, String name, A2 address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	void display() {
		System.out.println(id + " " + name);
		System.out.println(address.city + " " + address.state + " " + address.country);
	}

	public static void main(String[] args) {
		//A2 address1 = new A2("gzb", "UP", "india");
		A2 address2 = new A2("gno", "UP", "india");

		//N2 e = new N2(111, "varun", address1);
		N2 e2 = new N2(112, "arun", address2);

		//e.display();
		e2.display();

	}

	class A2 {
		String city, state, country;

		public A2(String city, String state, String country) {
			this.city = city;
			this.state = state;
			this.country = country;
		}

	}
}

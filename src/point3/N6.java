package point3;

 class TestThis1 {
	
	int rollno;  
	String name;  
	float fee;  
	TestThis1(int rollno,String name,float fee){  
	//rollno=rollno;  
	//name=name;  
	//fee=fee;  
	}  
	void display(){System.out.println(rollno+" "+name+" "+fee);}  
	}  
	public class N6{  
	public static void main(String args[]){  
		TestThis1 s1=new TestThis1(111,"ankit",5000f);  
		TestThis1 s2=new TestThis1(112,"sumit",6000f);  
	s1.display();  
	s2.display();  
	}

}

package point2;

public class N5 {
	
	public static void main(String args[]){  
		TestStudent4 s1=new TestStudent4();  
		TestStudent4 s2=new TestStudent4();  
		  s1.insertRecord(111,"Karan");  
		  s2.insertRecord(222,"Aryan");  
		  s1.displayInformation();  
		  s2.displayInformation();  
		 }
}
	class TestStudent4{  
		int rollno;  
		 String name;  
		 void insertRecord(int r, String n){  
		  rollno=r;  
		  name=n;  
		 }  
		 void displayInformation(){System.out.println(rollno+" "+name);}  

	}

package point3;

 class q {
	
	 int rollno;//instance variable  
	   String name;  
	   static String college ="ITS";//static variable  
	   //constructor  
	   q(int r, String n){  
	   rollno = r;  
	   name = n;  
	   }  
	   //method to display the values  
	   void display (){System.out.println(rollno+" "+name+" "+college);}  
	}    
	public class N1{  
	 public static void main(String args[]){  
	 q s1 = new q(111,"Karan");  
	 q s2 = new q(222,"Aryan");    
	 s1.display();  
	 s2.display();  
	 }  

}

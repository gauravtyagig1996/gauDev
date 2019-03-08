package point3;

 class aj {
	
	int rollno;  
    String name;  
    static String college = "ITS";  
    //static method to change the value of static variable  
    static void change(){  
    college = "BBDIT";  
    }  
    aj(int r, String n){  
    rollno = r;  
    name = n;  
    }  
    void display(){System.out.println(rollno+" "+name+" "+college);}  
}  
  
public class N4{  
   public static void main(String args[]){  
   aj.change();
   aj s1 = new aj(111,"Karan");  
   aj s2 = new aj(222,"Aryan");  
   aj s3 = new aj(333,"Sonoo");  
   s1.display();  
   s2.display();  
   s3.display();  
   }  

}

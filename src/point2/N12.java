package point2;

public class N12 {
	
	 int id;  
	    String name;    
	    N12(int i,String n){  
	    id = i;  
	    name = n;  
	    }  
	    void display(){System.out.println(id+" "+name);}  
	   
	    public static void main(String args[]){ 
	    N12 s1 = new N12(111,"Karan");  
	    N12 s2 = new N12(222,"Aryan");    
	    s1.display();  
	    s2.display();  
	   }  

}

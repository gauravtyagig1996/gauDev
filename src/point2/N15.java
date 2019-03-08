package point2;

public class N15 {
	
	 int id;  
	    String name;  
	    N15(int i,String n){  
	    id = i;  
	    name = n;  
	    }  
	    N15(){}  
	    void display(){System.out.println(id+" "+name);}  
	   
	    public static void main(String args[]){  
	    N15 s1 = new N15(111,"Karan");  
	    N15 s2 = new N15();  
	    s2.id=s1.id;  
	    s2.name=s1.name;  
	    s1.display();  
	    s2.display();  
	   }  

}

package point2;

public class N14 {
	
	int id;  
    String name;    
    N14(int i,String n){  
    id = i;  
    name = n;  
    }   
    N14(N14 s){  
    id = s.id;  
    name =s.name;  
    }  
    void display(){System.out.println(id+" "+name);}  
   
    public static void main(String args[]){  
    N14 s1 = new N14(111,"Karan");  
    N14 s2 = new N14(s1);  
    s1.display();  
    s2.display();  
   }  

}

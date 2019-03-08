package point2;

public class N13 {
	
	int id;  
    String name;  
    int age;   
    N13(int i,String n){  
    id = i;  
    name = n;  
    }  
    N13(int i,String n,int a){  
    id = i;  
    name = n;  
    age=a;  
    }  
    void display(){System.out.println(id+" "+name+" "+age);}  
   
    public static void main(String args[]){  
    N13 s1 = new N13(111,"Karan");  
    N13 s2 = new N13(222,"Aryan",25);  
    s1.display();  
    s2.display();  
   }  

}

package point3;

public class N11 {
	
	void m(N11 obj){  
		  System.out.println("method is invoked");  
		  }  
		  void p(){  
		  m(this);  
		  }  
		  public static void main(String args[]){  
		  N11 s1 = new N11();  
		  s1.p();  
		  }  

}

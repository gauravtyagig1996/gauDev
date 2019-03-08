package point3;

 class a1 {
	
	 N12 obj;  
	  a1(N12 obj){  
	    this.obj=obj;  
	  }  
	  void display(){  
	    System.out.println(obj.data);
	  }  
	}  
	  
	public class N12{  
	  int data=10;  
	  N12(){  
	   a1 b=new a1(this);  
	   b.display();  
	  }  
	  public static void main(String args[]){  
	   N12 a=new N12();  
	  }  

}

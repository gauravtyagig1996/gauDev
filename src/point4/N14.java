package point4;

 class motercycle {
	
	void run(){System.out.println("running");}  
	}  
	public class N14 extends motercycle{  
	  void run(){System.out.println("running safely with 60km");}  
	  
	  public static void main(String args[]){  
	    motercycle b = new N14(); //upcasting 
	    b.run();  
	  }  

}

package point4;


	
	class Animal3{  
		void eat(){System.out.println("eating");}  
		}
	
	 class BabyDog extends Animal3{  
		void eat(){System.out.println("eating fruits");}  
		} 
	
		public class N18 extends BabyDog{  
		void eat(){System.out.println("drinking milk");}  
		public static void main(String args[]){  
		Animal3 a1,a2,a3;  
		a1=new Animal3();  
		a2=new BabyDog();  
		a3=new N18();  
		a1.eat();  
		a2.eat();  
		a3.eat();  
		}
}

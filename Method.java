
public class Method {
	static{
		System.out.println("this is static block");
	}
   static{
		System.out.println("this is instance block");
	}
Method(){
	System.out.println("this is constructor block");
}

	 void m1() {
		 System.out.println("this is instance method");
	 }
	static void m2() {
		System.out.println("this is static method");
	}
	
	public static void main(String[] args) {
	Method m=new Method();
	m.m1();
	Method.m2();
	
	
		

	}

}

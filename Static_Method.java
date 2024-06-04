
public class Static_Method {

	static int a=100;
	static String b="hello ashish";
	
	  static void show() {
		  System.out.println(a);
		  System.out.println(b);
		  
	  }
	  
	  void show2() {
		  show();
	  }
	public static void main(String[] args) {
		Static_Method m=new Static_Method();
		m.show2();
	show();
		
		
	}

}

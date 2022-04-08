
public class StaticDemo {
  static int a=10;//static variable
  int b=10;//non-static variable
  
  public static void m1() {
	  System.out.println("Static method");
  }
  
  public  void m2() {
	  System.out.println("Non static method");
  }
	
	
	public static void main(String[] args) {
		System.out.println(a);
		//System.out.println(b);
		
		//m2();
		m1();

	}

}

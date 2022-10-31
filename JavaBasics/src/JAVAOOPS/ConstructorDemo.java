package JAVAOOPS;

public class ConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Before creating an object");
		int i = 10,j =5;
		ConstructorDemo cd = new ConstructorDemo(i,j);
		System.out.println("After creating an object");
	}
	public ConstructorDemo(int a, int b) {
		System.out.println("This is a constructor : "+a+"  "+b);
	}
	static {
		System.out.println("This is a static block");
	}
	public static void demo() {
		System.out.println("this is demo");
	}

}

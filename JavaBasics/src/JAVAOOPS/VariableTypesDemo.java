package JAVAOOPS;

public class VariableTypesDemo {
	static int a = 20; //class or static variable
	int b =30; // instance variable
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c = 30;//local variable
		
		VariableTypesDemo vt1 = new VariableTypesDemo();
		VariableTypesDemo vt2 = new VariableTypesDemo();
		VariableTypesDemo vt3 = new VariableTypesDemo();
		vt1.b = 15;
		System.out.println("Vt1 object b value is "+vt1.b);
		vt2.b = 40;
		System.out.println("vt2 object b value is "+vt2.b);
		System.out.println("vt3 object b value is "+vt3.b);
		
		demo();
		vt1.dummy();
		vt2.dummy();
		
	}
	public VariableTypesDemo() {
		System.out.println("This is constructor");
	}
	public static void demo() {
		System.out.println("This is the value of static variable : "+a);
	}
	public void dummy() {
		System.out.println("This is the static varaible inside non static method : "+VariableTypesDemo.a);
		System.out.println("This is the nonstatic variable inside non static method "+b);
	}

}

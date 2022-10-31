package JAVAOOPS;

public class MethodOverloading {

	public static void main(String[] args) {
		MethodOverloading mo = new MethodOverloading();
		mo.add(10, 20.5);
		mo.add(10,10);
	}
	public void add(int a,int b) {
		System.out.println("Addition of integers");
	}
	public void add(double a,double b) {
		System.out.println("Addition of double");
	}
	public void add(int a, double b) {
		System.out.println("Addition of integer and double");
	}

}

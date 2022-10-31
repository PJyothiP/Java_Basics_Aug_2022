package JAVAOOPS;

public class ObjectsDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo();
		ObjectsDemo1 obj = new ObjectsDemo1();
		obj.demo1();

	}
	
	public static void demo() {
		System.out.println("This is a static method");
	}
	
	public void demo1() {
		System.out.println("This is a non static method");
	}

}

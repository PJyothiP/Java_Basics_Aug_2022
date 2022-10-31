package JAVAOOPS;

public class ObjectDemo {

	public static void main(String[] args) {
		System.out.println("This is main method");
		ObjectsDemo1.demo();
		ObjectDemo od = new ObjectDemo();
		od.demo();
		System.out.println("After calling demo method");
		ObjectsDemo1 obj1 = new ObjectsDemo1();
		obj1.demo1();
	}
	public void demo() {
		System.out.println("Inside demo");
	}

}

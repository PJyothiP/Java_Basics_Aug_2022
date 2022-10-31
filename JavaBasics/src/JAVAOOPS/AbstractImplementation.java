package JAVAOOPS;

public class AbstractImplementation extends AbstractClass{

	public static void main(String[] args) {
		AbstractImplementation ai = new AbstractImplementation(); // object creation
		AbstractClass ac = new AbstractImplementation();  // object reference creation
		ai.demo();
		ai.dummy();
		
		System.out.println("--------------------");
		
		ac.demo();
		ac.dummy();
		
	}
	public AbstractImplementation() {
		System.out.println("This is the constructor");
	}

	@Override
	public void demo() {
		System.out.println("This is the abstract method in child class");
	}
	public void dummy(int a) {
		System.out.println("This is the dummy method in child class");
	}

}

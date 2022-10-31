package JAVAOOPS;

public class EncapsulationImplementation {

	public static void main(String[] args) {
		EncapsulationDemo ed = new EncapsulationDemo();
		ed.setA(10);
		ed.setB(5.5);
		ed.setS("Hello");
		System.out.println("This is the value of a : "+ed.getA());
		System.out.println("This is the value of b : "+ed.getB());
		System.out.println("This is the value of s : "+ed.getS());
	}

}

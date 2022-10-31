package JAVAOOPS;

public class InterfaceImplementation implements InterfaceDemo,Interface2{

	public static void main(String[] args) {
		InterfaceImplementation ii = new InterfaceImplementation();//class object
		ii.ownMethod();
		InterfaceDemo ii2 = new InterfaceImplementation(); // first interface object reference
		System.out.println("This is the hashcode for interfacedemo object : "+ii2.hashCode());
		ii2.demo();
		Interface2 ii3 = new InterfaceImplementation(); // second interface object reference
		System.out.println("This is the hashcode for interface2 object "+ii3.hashCode());
		ii3.demo();
	}
	@Override
	public void demo() {
		if(this.hashCode() == 1919892312) {
			System.out.println("This is abstract demo method of interfaceDemo");
		}else if(this.hashCode() == 1143839598) {
			System.out.println("This is abstract demo method of interface2");
		}	
	}
	@Override
	public void dummy() {
		System.out.println("This is abstract dummy method of interface");
	}
	public void ownMethod() {
		System.out.println("This is the own method of the class");
	}
	@Override
	public void session() {
		System.out.println("This is the abstract session method of interface");
	}
}

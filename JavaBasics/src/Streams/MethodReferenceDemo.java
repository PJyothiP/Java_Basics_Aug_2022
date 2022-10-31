package Streams;

public class MethodReferenceDemo {

	public static void main(String[] args) {

		FunctionalInterfaceDemo fid1 = MethodReferenceDemo::staticMethod; //refering to a static method
		fid1.abstractDummy("Vassvik");
		
		
		MethodReferenceDemo mrd = new MethodReferenceDemo("Shiv");
		FunctionalInterfaceDemo fid2 = mrd::nonstaticMethod; //refering to a non static method
		fid2.abstractDummy("Shivansh");
		
		
		FunctionalInterface2 fid3 = MethodReferenceDemo::new; // refering to a constructor
		fid3.dummy("Yognavi");
		
	}
	public static int staticMethod(String a) {
		System.out.println("This is the static method reference");
		return 0;
	}
	public int nonstaticMethod(String a) {
		System.out.println("This is the non static method reference");
		return 0;
	}
	public MethodReferenceDemo(String a) {
		System.out.println("This is the constructor reference");
	}
	

}

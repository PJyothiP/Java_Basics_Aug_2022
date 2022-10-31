package Streams;

public class FIImplementation{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FunctionalInterfaceDemo fid = (x) -> x.length();
		
		int length = fid.abstractDummy("Vassvik");
		System.out.println("This is the length of the given string "+length);
		
		fid.defaultDemo();
		FunctionalInterfaceDemo.staticDemo();
		
		
		/*FunctionalInterfaceDemo fid1 = (x) -> System.out.println("The string after concat is : "+x.concat(" Welcome"));
		fid1.abstractDummy("Shivansh");
		*/
	}
	
}

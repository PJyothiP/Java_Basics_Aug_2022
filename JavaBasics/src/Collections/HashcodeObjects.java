package Collections;

public class HashcodeObjects {

	public static void main(String[] args) {
		HashcodeObjects h1 = new HashcodeObjects();
		HashcodeObjects h2 = new HashcodeObjects();
		HashcodeObjects h3 = h1;
		
		HashcodeDemo h4 = new HashcodeDemo();
		
		
		System.out.println("The hashcode of h1 is : "+h1.hashCode()+" for h2 is : "+h2.hashCode()+" and for h3 is : ");
		
		if(h1 == h2) {
			System.out.println("The objects are equal");
		}else if(h1 == h3) {
			System.out.println("h1 and h3 are equal");
		}
		System.out.println("--------------------------------");
		
		HashcodeParameters hp1 = new HashcodeParameters(1234, "Vassvik");
		HashcodeParameters hp2 = new HashcodeParameters(123456,null);
		HashcodeParameters hp3 = hp1;
		
		
		System.out.println("The hashcode of hp1 : "+hp1.hashCode()+" and for hp2 is : "+hp2.hashCode());
		if(hp1.equals(hp2)) {
			System.out.println("The two objects are equal");
		}
		else {
			System.out.println("The two objects are different");
		}
	
		
	}

}

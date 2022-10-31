package Collections;

public class HashcodeDemo {

	public static void main(String[] args) {
		String x = "Aa";
		String y  = "BB";
		System.out.println("The hashcode for x is : "+x.hashCode()+" the hascode of y is : "+y.hashCode());
		if(x.equals(y)) {
			System.out.println("Both the strings are equal");
		}else {
			System.out.println("The strings are different");
		}
	
	
	}

}

package Basics;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcd1234";
		String s = "";
		int j = str.length()/2;
		for(int i = 0,k=0;i<str.length();i++) {
			if(i%2 == 0) {
				s= s+str.charAt(k++);
			}else {
				s=s+str.charAt(j++);
			}
		}
		System.out.println(s);
	}

}

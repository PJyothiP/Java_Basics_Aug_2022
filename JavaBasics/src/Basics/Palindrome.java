package Basics;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 693,rem = 0,temp = n;
		for(;temp>0;) {
			rem = (rem*10)+(temp%10);
			temp = temp/10;
		}
		if(rem == n) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not a palindrome");
		}
	}

}

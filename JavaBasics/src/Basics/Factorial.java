package Basics;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10,res = n;
		for(int j = (n-1);j>1;j--) {
			res=res*j;
		}
		System.out.println("The factorial of n is :"+res);
	}

}

package Basics;

public class SwapNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10,b =5;
		a = a+b;
		b=a-b;
		a = a-b;
		System.out.println("a value is : "+a+" and b value is : "+b);
		//double swap
		int temp;
		temp = a;
		a=b;
		b=temp;
		System.out.println("a value after double swap : "+a+" and b value is :" +b);
	}

}

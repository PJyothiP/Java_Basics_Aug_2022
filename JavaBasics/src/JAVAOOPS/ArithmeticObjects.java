package JAVAOOPS;

public class ArithmeticObjects {

	public static void main(String[] args) {
		int i = 10,j=5;
		ArithmeticObjects ao = new ArithmeticObjects();
		int additionResult = addition(i,j);
		System.out.println("The result of addition is :"+additionResult);
		System.out.println("The result of subtraction is :"+ao.subtraction(i, j));
		System.out.println("The result of multication is : "+ao.multiplication(i, j));
		System.out.println("The result of division is : "+ao.division(i, j));
		System.out.println("The result of modulo is :"+ao.modulo(i, j));
		
	}
	public static int addition(int a,int b) {
		return (a+b);
	}
	public int subtraction(int x,int y) {
		return (x-y);
	}
	public int multiplication(int a,int b) {
		return (a*b);
	}
	public double division(int a, int b) {
		return (a/b);
	}
	public int modulo(int a, int b) {
		return (a%b);
	}
}

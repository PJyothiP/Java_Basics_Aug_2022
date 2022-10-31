package Basics;

public class SwitchArithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10,b = 5;
		String op = "*";
		switch(op) {
		case "+":
			System.out.println("The addition of two numbers is "+(a+b));
			break;
		case "-":
			System.out.println("The subtraction of two numbers is :"+(a-b));
			break;
		case "*":
			System.out.println("The multiplication of two numbers is : "+(a*b));
			break;
		case "/":
			System.out.println("The division of two numbers is : "+(a/b));
			break;
		case "%":
			System.out.println("The modulo of two numbers is :"+(a%b));
			break;
			default :
				System.out.println("Invalid Operand");
		}
	}

}

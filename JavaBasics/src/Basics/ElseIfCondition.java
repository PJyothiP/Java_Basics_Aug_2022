package Basics;

public class ElseIfCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=15,b=7,c=20;
		if(a>b) {
			if(a>c) {
				System.out.println("a is greater");
			}else {
				System.out.println("c is greater");
			}
		}else if(b>c) {
			System.out.println("b is greater than c");
		}else if(a>c) {
			System.out.println("a is greater than c");
		}else {
			System.out.println("c is greater");
		}
	}

}

package Basics;

public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1;i<=5;i++) {
			for(int j =i;j>0;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-----------------------------");
		
		//Inverted pyramid
		
		for(int i = 1; i<=5;i++) {
			for(int j = 5;j>=i;j--) {
				System.out.print("*");
			}System.out.println();
		}
	}

}

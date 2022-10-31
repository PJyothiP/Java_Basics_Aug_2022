package Basics;

public class ForLoopDemo {

	public static void main(String[] args) {
		//for loop
		
		int i =1;
		for(;i<=10;) {
			System.out.println(i);
			i++;
		}
		System.out.println("------------------------");
		
		//while loop
		i =10;
		
		while(i>=1) {
			System.out.println(i);
			i--;
		}
		
		System.out.println("----------------------");
		
		//dowhile loop
		
		do {
			System.out.println("code will be executed atleast once");
		}while(false);
		
		System.out.println("-----------------------");
		
		//for each loop
		int[] a = {10,15,20,25,30};
		for (int j : a) {
			System.out.println(j*3);
		}
		
	}

}

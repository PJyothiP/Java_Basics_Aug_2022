package Basics;

public class EvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i =0;i<=100;i=i+2) {
			System.out.println(i);
		}
		
		int j =0;
		while(j<=100) {
			if(j%2 == 0) {
				System.out.print(j);
			}
			j++;
		}
	}

}

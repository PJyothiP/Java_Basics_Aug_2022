package Basics;

public class ArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str[] = {"Vassvik","Shivansh","Yogi","Varshi"};
		
		//for loop
		
		for(int i =0;i<str.length;i++) {
			System.out.println(str[i]);
		}
		 
		int j = 0;
		//while loop
		
		while(j<str.length) {
			System.out.println(str[j].concat(" welcome "));
			j++;
		}
		
		//foreach
		for (String string123 : str) {
			System.out.println(string123.toUpperCase());
		}

	}

}

package Basics;

public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Integer Arrays
		
		int a[] = new int[5];
		a[0]=10;
		a[1]=15;
		a[2]=20;
		System.out.println("The second element of array is : "+a[1]);
		
		//float array
		
		double f[] = {7.3,9.8,4.6,3.9};
		System.out.println("The third element of float array is : "+f[2]);
		
		//char array
		
		char[] ch = {'f','g','e','z','r',49};
		System.out.println("The last element of character array is : "+ch[5]);
		
		
		//Strings array
		
		String[] str= {"This","is","a","demo","class"};
		System.out.println("The second element of string array : "+str[1]);
		
		String s = "August month new batch";
		String[] splittedArray = s.split("nth");
		System.out.println("The second element of splitted array : "+splittedArray[1]);
		
	}

}

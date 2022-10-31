package Basics;


public class Variables {

	public static void main(String[] args) {
		// Integer variables
		int a = 10,b =20;
		
		System.out.println("The addition of a and b is : "+(a+b)+" The addition is completed "+a+b);
		
		System.out.println("-------------------------------------------------");
		
		//Floating variables
		
		double f = 10.5;
		double res = a+f;
		System.out.println("The addition of float variables is : "+res);
		
		//Char varaibles
		
		//char ch = 'n';
		char ch = 49; //ASCII code integer
		System.out.println("This is the character stored in ch variable : "+ch);
		
		//Strings
		
		String s = "This is a demo class";
		String s2 = "    demo   123       ";
		
		
		System.out.println("The string is : "+s);
		System.out.println("The length of the given string is :"+s.length());
		System.out.println("Is s2 present in s : "+s.contains(s2));
		System.out.println("After replace : "+s.replace("is", "is not"));
		System.out.println("characters from 2 to 10 : "+s.substring(2,10));
		System.out.println("Character at 11th position : "+s.charAt(10));
		System.out.println("String s2 : "+s2);
		System.out.println("String s2 after trim: "+s2.trim());
		System.out.println("Concat s and s2 : "+s.concat(s2));
		System.out.println("Upper case of string s : "+s.toUpperCase());
		System.out.println("Does s starts with T : "+s.startsWith("This"));
		
		System.out.println("----------------------------------------------");
		
		//boolean variables
		
		boolean flag = s.contains(s2);
		System.out.println("Does s contains s2 : "+flag);
		
	}

}

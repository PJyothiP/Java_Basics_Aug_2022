package Collections;

import java.util.HashMap;

public class KeypadDemo {
	public static HashMap<Character,Integer> hm = new HashMap<Character,Integer>();

	public static void main(String[] args) {
		String s = "vassik";
		KeypadDemo kd = new KeypadDemo();
		boolean flag = kd.checkIfCaps(s);
		
		System.out.println("if given string contains capitals : "+flag);
		if(flag) {
			System.out.println("Cannot calculate the total because string contains capital letters");
		}else {
			kd.insertIntoMap();
			System.out.println("The entry set of map is : "+hm.entrySet());
			System.out.println("The total of the given string is : "+kd.calculateSum(s));
		}
	}
	
	public boolean checkIfCaps(String s) {
		for(int i = 0;i<s.length();i++) {
			if((s.charAt(i) >= 'A') && (s.charAt(i) <= 'Z')) {
				return true;
			}
		}
		return false;
	}
	
	public void insertIntoMap() {
		int tmp = 1,count = 1;
		for(char ch = 'a';ch<='z';ch++) {
			if(tmp>3) {
				count++;
				tmp = 1;
			}
			hm.put(ch, count);
			tmp++;
		}
	}
	
	public int calculateSum(String s) {
		int sum =0;
		for(int i = 0; i<s.length();i++) {
			sum += hm.get(s.charAt(i));
			System.out.println("The sum value is : "+sum);
		}
		return sum;
	}

}

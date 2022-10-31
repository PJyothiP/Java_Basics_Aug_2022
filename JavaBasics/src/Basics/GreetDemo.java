package Basics;

import java.util.Calendar;

public class GreetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int time = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
		System.out.println("This is the current hour : "+time);
		if(time > 0 && time < 10) {
			System.out.println("Good Morning");
		}else if(time >= 10 && time < 16) {
			System.out.println("Good Afternoon");
		}else if(time >= 16 && time < 21) {
			System.out.println("Good Evening");
		}else {
			System.out.println("Good Night");
		}
	}

}

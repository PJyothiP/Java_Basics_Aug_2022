package Basics;

public class SwitchCaseCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String date = "Jan";
		int convertedDate = 0;
		switch(date) {
		case "Jan" :
			convertedDate = 01;
			break;
		case "Feb" :
			convertedDate = 02;
			break;
		case "Mar":
			convertedDate = 03;
			break;
		case "Apr":
			convertedDate = 04;
			break;
		case "May":
			convertedDate = 05;
			break;
		default :
				System.out.println("Invalid date");
		}
		System.out.println("After switch converted date for "+ date +" is :"+convertedDate);
				
	}

}

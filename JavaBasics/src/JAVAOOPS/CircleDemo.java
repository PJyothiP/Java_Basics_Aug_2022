package JAVAOOPS;

public class CircleDemo {
	final static double pi = 3.14;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int radius = 10;
		CircleDemo cd = new CircleDemo();
		System.out.println("The area of circle is : "+cd.area(radius));
		System.out.println("The circumference of the circle is :"+cd.circumference(radius));
		System.out.println("The diameter of the circle is :"+cd.diameter(radius));
	}
	public double area(double radius) {
		return pi*radius*radius;
	}
	public double circumference(int radius) {
		return 2*pi*radius;
	}
	public double diameter(int radius) {
		return 2*radius;
	}
}

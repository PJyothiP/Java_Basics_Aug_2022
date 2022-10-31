package JAVAOOPS;

public class EncapsulationDemo {
	private int a;
	private double b;
	private String s;
	
	public int getA() {
		return a;
	}
	public void setA(int ab) {
		this.a = ab*2/5+4;
	}
	public double getB() {
		return b;
	}
	public void setB(double d) {
		this.b = d;
	}
	public String getS() {
		return s;
	}
	public void setS(String s) {
		this.s = s+"world";
	}

}

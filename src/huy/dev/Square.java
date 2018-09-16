package huy.dev;

public abstract class Square extends Shape{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	private double cr;
	private double cd;
	public Square (double cr,double cd) {
		this.cd=cd;
		this.cr=cr;
	}
	public double dientich() {
		return cr*cd;
	}

}


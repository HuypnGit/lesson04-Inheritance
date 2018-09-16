package huy.dev;

public abstract class Circle extends Shape {
		private double r;
		public Circle(double r) {
			this.r=r;
		}
	@Override
	public double dientich() {
		return 3.14*r*r;
		}
	}

package by.htp.ex15.entity;

public class Circle extends GometricFigure{
	
	double r;
	
	public Circle(double r) {
		super();
		this.r = r;
	}

	@Override
	public String toString() {
		return "Circle [r=" + r + "]";
	}

	@Override
	public double S() {
		// TODO Auto-generated method stub
		return Math.PI*Math.pow(r, 2);
	}

}

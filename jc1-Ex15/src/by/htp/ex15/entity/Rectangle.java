package by.htp.ex15.entity;

public class Rectangle extends GometricFigure{
	
	private double side1;
	private double side2;
	
	

	public Rectangle(double side1, double side2) {
		super();
		this.side1 = side1;
		this.side2 = side2;
	}

	public double getSide1() {
		return side1;
	}

	public void setSide1(double side1) {
		this.side1 = side1;
	}

	public double getSide2() {
		return side2;
	}

	public void setSide2(double side2) {
		this.side2 = side2;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(side1);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(side2);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rectangle other = (Rectangle) obj;
		if (Double.doubleToLongBits(side1) != Double.doubleToLongBits(other.side1))
			return false;
		if (Double.doubleToLongBits(side2) != Double.doubleToLongBits(other.side2))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Square [side1=" + side1 + ", side2=" + side2 + "]";
	}

	@Override
	public double square() {
		// TODO Auto-generated method stub
		return side1*side2;
	}

}

package by.htp.ex15.entity;

public class Circle extends GometricFigure{
	
	double r;
	
	public Circle(double r) {
		super();
		this.r = r;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(r);
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
		Circle other = (Circle) obj;
		if (Double.doubleToLongBits(r) != Double.doubleToLongBits(other.r))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "Circle [r=" + r + "]";
	}

	@Override
	public double square() {
		// TODO Auto-generated method stub
		return Math.PI*Math.pow(r, 2);
	}

}

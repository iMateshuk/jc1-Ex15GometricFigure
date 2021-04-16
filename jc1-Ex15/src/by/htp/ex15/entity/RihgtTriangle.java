package by.htp.ex15.entity;

public class RihgtTriangle extends GometricFigure{
	double cated1;
	double cated2;

	public RihgtTriangle(double cated1, double cated2) {
		super();
		this.cated1 = cated1;
		this.cated2 = cated2;
	}

	public double getCated1() {
		return cated1;
	}

	public void setCated1(double cated1) {
		this.cated1 = cated1;
	}

	public double getCated2() {
		return cated2;
	}

	public void setCated2(double cated2) {
		this.cated2 = cated2;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(cated1);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(cated2);
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
		RihgtTriangle other = (RihgtTriangle) obj;
		if (Double.doubleToLongBits(cated1) != Double.doubleToLongBits(other.cated1))
			return false;
		if (Double.doubleToLongBits(cated2) != Double.doubleToLongBits(other.cated2))
			return false;
		return true;
	}

	@Override
	public double square() {
		// TODO Auto-generated method stub
		return 0.5*cated1*cated2;
	}

	@Override
	public String toString() {
		return "RihgtTriangle [cated1=" + cated1 + ", cated2=" + cated2 + "]";
	}
	
	

}

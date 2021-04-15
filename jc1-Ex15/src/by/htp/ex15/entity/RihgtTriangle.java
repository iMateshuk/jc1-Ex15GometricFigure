package by.htp.ex15.entity;

public class RihgtTriangle extends GometricFigures{
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
	public double S() {
		// TODO Auto-generated method stub
		return 0.5*cated1*cated2;
	}

	@Override
	public String toString() {
		return "RihgtTriangle [cated1=" + cated1 + ", cated2=" + cated2 + "]";
	}
	
	

}

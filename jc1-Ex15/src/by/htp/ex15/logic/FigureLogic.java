package by.htp.ex15.logic;

import by.htp.ex15.entity.*;

public class FigureLogic {
	
	public GometricFigure createSquare(double x, double y) {
		if (x <= 0 || y <= 0 ) {
			throw new IllegalArgumentException("createSquare не должен быть <= 0");
		}
		return new Square(x, y);
	}
	
	public GometricFigure createCircle(double x) {
		if (x <= 0) {
			throw new IllegalArgumentException("createCircle не должен быть <= 0");
		}
		return new Circle(x);
	}
	
	public GometricFigure createTriangle(double x, double y, double z) {
		if ((x <= 0 || y <= 0) || z <= 0) {
			throw new IllegalArgumentException("createTriangle не должен быть <= 0");
		}
		return new Triangle(x, y, z);
	}
	

	public GometricFigure createRightTriangle(double x, double y) {
		if (x <= 0 || y <= 0) {
			throw new IllegalArgumentException("createTriangle не должен быть <= 0");
		}
		return new RihgtTriangle(x, y);
	}
}

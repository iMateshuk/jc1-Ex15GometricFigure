package by.htp.ex15.logic;

import by.htp.ex15.entity.*;

public class FiguresLogic {
	
	public GometricFigures genSquare() {
		return new Square(Math.ceil((Math.random()*10 + 1)*100)/100, Math.ceil((Math.random()*10 + 1)*100)/100);
	}
	
	public GometricFigures createSquare(double x, double y) {
		if (x <= 0 || y <= 0 ) {
			System.out.println("qwe");
		}
		return new Square(x, y);
	}
	
	public GometricFigures genCircle() {
		return new Circle(Math.ceil((Math.random()*10 + 1)*100)/100);
	}
	
	public GometricFigures createCircle(double x) {
		if (x <= 0) {
			System.out.println("qwe");
		}
		return new Circle(x);
	}
	
	public GometricFigures genTriangle() {
		return new Triangle(Math.ceil((Math.random()*10 + 1)*100)/100, Math.ceil((Math.random()*10 + 1)*100)/100, Math.ceil((Math.random()*10 + 1)*100)/100);
	}
	
	public GometricFigures createTriangle(double x, double y, double z) {
		if ((x <= 0 || y <= 0) || z <= 0) {
			System.out.println("qwe");
		}
		return new Triangle(x, y, z);
	}
	

	public GometricFigures genRightTriangle() {
		return new RihgtTriangle(Math.ceil((Math.random()*10 + 1)*100)/100, Math.ceil((Math.random()*10 + 1)*100)/100);
	}
	
	public GometricFigures createRightTriangle(double x, double y) {
		if (x <= 0 || y <= 0) {
			System.out.println("qwe");
		}
		return new RihgtTriangle(x, y);
	}
}

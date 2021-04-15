package by.htp.ex15.generator;

import by.htp.ex15.entity.*;

public class FigureGenerator {
	
	public GometricFigure genSquare() {
		return new Square(Math.ceil((Math.random()*10 + 1)*100)/100, Math.ceil((Math.random()*10 + 1)*100)/100);
	}
	
	public GometricFigure genCircle() {
		return new Circle(Math.ceil((Math.random()*10 + 1)*100)/100);
	}
	
	public GometricFigure genTriangle() {
		return new Triangle(Math.ceil((Math.random()*10 + 1)*100)/100, Math.ceil((Math.random()*10 + 1)*100)/100, Math.ceil((Math.random()*10 + 1)*100)/100);
	}
	
	public GometricFigure genRightTriangle() {
		return new RihgtTriangle(Math.ceil((Math.random()*10 + 1)*100)/100, Math.ceil((Math.random()*10 + 1)*100)/100);
	}

}

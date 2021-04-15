package by.htp.ex15.start;

import by.htp.ex15.entity.FigureData;
import by.htp.ex15.entity.GometricFigure;
import by.htp.ex15.generator.FigureGenerator;
import by.htp.ex15.logic.FigureLogic;
import by.htp.ex15.present.FigurePrint;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FigureGenerator fiGen = new FigureGenerator();
		FigureLogic fl = new FigureLogic();
		FigureData fd = new FigureData();
		FigurePrint fp = new FigurePrint();
		
		fd.getFiguresData().add(fiGen.genSquare());
		fd.getFiguresData().add(fiGen.genCircle());
		fd.getFiguresData().add(fiGen.genTriangle());
		fd.getFiguresData().add(fiGen.genRightTriangle());
		fd.getFiguresData().add(fl.createSquare(5, 5));
		
		double sum = 0;
		
		for (GometricFigure figure : fd.getFiguresData()) {
			fp.figuresPrint(figure);
			sum += figure.S();
		}
		
		System.out.println("sum = " + Math.ceil(sum*100)/100);

	}

}

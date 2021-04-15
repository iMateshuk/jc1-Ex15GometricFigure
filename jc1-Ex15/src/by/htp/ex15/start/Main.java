package by.htp.ex15.start;

import by.htp.ex15.entity.FiguresData;
import by.htp.ex15.entity.GometricFigures;
import by.htp.ex15.logic.FiguresLogic;
import by.htp.ex15.present.FiguresPrint;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FiguresLogic fl = new FiguresLogic();
		FiguresData fd = new FiguresData();
		FiguresPrint fp = new FiguresPrint();
		
		fd.getFiguresData().add(fl.genSquare());
		fd.getFiguresData().add(fl.genCircle());
		fd.getFiguresData().add(fl.genTriangle());
		fd.getFiguresData().add(fl.genRightTriangle());
		
		double sum = 0;
		
		for (GometricFigures figure : fd.getFiguresData()) {
			fp.figuresPrint(figure);
			sum += figure.S();
		}
		
		System.out.println("sum = " + Math.ceil(sum*100)/100);

	}

}

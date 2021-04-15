package by.htp.ex15.entity;

import java.util.ArrayList;

public class FigureData {
	
	ArrayList<GometricFigure> figuresData;
	
	public FigureData(){
		figuresData = new ArrayList<GometricFigure>();
	}
	
	public FigureData(ArrayList<GometricFigure> figuresDat){
		this.figuresData = figuresDat;
	}

	public ArrayList<GometricFigure> getFiguresData() {
		return figuresData;
	}

	public void setFiguresData(ArrayList<GometricFigure> figuresData) {
		this.figuresData = figuresData;
	}
	
	

}

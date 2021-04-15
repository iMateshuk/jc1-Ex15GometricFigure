package by.htp.ex15.entity;

import java.util.ArrayList;

public class FiguresData {
	
	ArrayList<GometricFigures> figuresData;
	
	public FiguresData(){
		figuresData = new ArrayList<GometricFigures>();
	}
	
	public FiguresData(ArrayList<GometricFigures> figuresDat){
		this.figuresData = figuresDat;
	}

	public ArrayList<GometricFigures> getFiguresData() {
		return figuresData;
	}

	public void setFiguresData(ArrayList<GometricFigures> figuresData) {
		this.figuresData = figuresData;
	}
	
	

}

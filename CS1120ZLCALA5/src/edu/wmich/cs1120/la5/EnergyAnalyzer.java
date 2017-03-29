package edu.wmich.cs1120.la5;

import java.util.ArrayList;

public class EnergyAnalyzer implements IRover{

	private ArrayList<IArea> path;
	private String analysis;
	@Override
	/**
	 * Array list <IArea> getPath
	 * @return path 
	*/
	public ArrayList<IArea> getPath() {
		// TODO Auto-generated method stub
		return path;
	}

	@Override
	/**
	 * @param path ArrayList <IArea>
	 * Sets this.path to parameter path
	*/
	public void setPath(ArrayList<IArea> path) {
		// TODO Auto-generated method stub
		this.path = path;
	}

	@Override
	/**
	 * analyze the path
	*/
	public void analyzePath() {
		// TODO Auto-generated method stub
		double pathEnergy = 0;
		for(int i=0; i<path.size();i++){
			pathEnergy += getPath().get(i).calcConsumedEnergy();
		}
		analysis = toString() + Double.toString(pathEnergy);
	}

	@Override
	/**
	 * analysis getter
	 * @return analysis 
	*/
	public String getAnalysis() {
		// TODO Auto-generated method stub
		return analysis;
	}

	@Override
	/**
	 * analysis setter
	*/
	public void setAnalysis(String analysis) {
		// TODO Auto-generated method stub
		this.analysis = analysis;
	}
	
	@Override
	/**
	 * Returns text
	 * @return "Energy analyzer: "
	*/
	public String toString(){
		return "Energy analyzer: ";
	}
}

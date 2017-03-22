package edu.wmich.cs1120.la5;

import java.util.ArrayList;

public class ElevationAnalyzer implements IRover{

	private ArrayList<IArea> path;
	private String analysis;
	@Override
	public ArrayList<IArea> getPath() {
		// TODO Auto-generated method stub
		return path;
	}

	@Override
	public void setPath(ArrayList<IArea> path) {
		// TODO Auto-generated method stub
		this.path = path;
	}

	@Override
	public void analyzePath() {
		// TODO Auto-generated method stub
		double averageElevation = 0;
		for(int i=0; i<path.size();i++){
			averageElevation += getPath().get(i).getElevation();
		}
		analysis = toString() + Double.toString(averageElevation/path.size());
	}

	@Override
	public String getAnalysis() {
		// TODO Auto-generated method stub
		return analysis;
	}

	@Override
	public void setAnalysis(String analysis) {
		// TODO Auto-generated method stub
		this.analysis = analysis;
	}
	
	@Override
	public String toString(){
		return "Elevation analyzer: ";
	}

}

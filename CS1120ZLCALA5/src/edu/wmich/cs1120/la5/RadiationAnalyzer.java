package edu.wmich.cs1120.la5;

import java.util.ArrayList;

public class RadiationAnalyzer implements IRover{

	private MapCreatorFromTxt mcft;
	private MapCreatorFromDat mcfd;
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
		path = mcft.getScanner().getPath(startRow, startCol);
		path = mcfd.getScanner().getPath(startRow, startCol);
	}

	@Override
	public void analyzePath() {
		// TODO Auto-generated method stub
		double pathRadiation = 0;
		for(int i=0; i<path.size();i++){
			pathRadiation += getPath().get(i).getRadiation();
		}
		analysis = Double.toString(pathRadiation);
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

}

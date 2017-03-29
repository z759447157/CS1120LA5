package edu.wmich.cs1120.la5;

import java.util.ArrayList;

public class RadiationAnalyzer implements IRover{

	private ArrayList<IArea> path;
	private String analysis;
	@Override
	/**
	 * path getter
	 * @return path
	 */
	public ArrayList<IArea> getPath() {
		// TODO Auto-generated method stub
		return path;
	}

	@Override
	/**
	 * path setter
	 * @param path ArrayList<IArea>
	 * @return path
	 */
	public void setPath(ArrayList<IArea> path) {
		// TODO Auto-generated method stub
		this.path = path;
	}

	@Override
	public void analyzePath() {
		// TODO Auto-generated method stub
		double pathRadiation = 0;
		for(int i=0; i<path.size();i++){
			pathRadiation += getPath().get(i).getRadiation();
		}
		analysis = toString() + Double.toString(pathRadiation);
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
	 * String return
	 * @return "Radiation analyzer: "
	 */
	public String toString(){
		return "Radiation analyzer: ";
	}

}

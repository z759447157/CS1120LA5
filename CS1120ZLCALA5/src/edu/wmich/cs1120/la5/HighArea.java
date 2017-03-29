package edu.wmich.cs1120.la5;

import edu.wmich.cs1120.la5.Area;

/**
 * Sub class for area
 * @author Zhixiang Li
 *
 */
public class HighArea extends Area{

	
	/**
	 * HighArea constructor for convenience.
	 * @param basicEnergyCost
	 * @param elevation
	 * @param radiation
	 */
	public HighArea(double basicEnergyCost,double elevation,double radiation){
		super(basicEnergyCost,elevation,radiation);
	}
	 /**
	  * Overridden method for calculating total consumed energy.
	  * @return getBasicEnergy int
	  */
	public double calcConsumedEnergy() {
		// TODO Auto-generated method stub
		return getBasicEnergyCost() * 4;
	}
}

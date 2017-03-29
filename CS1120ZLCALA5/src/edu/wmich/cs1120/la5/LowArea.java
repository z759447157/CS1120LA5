package edu.wmich.cs1120.la5;

public class LowArea extends Area{

	/**
	 * Sub class for area
	 * @author Zhixiang Li
	 *
	 */
	
	/**
	 * LowArea constructor for convenience.
	 * @param basicEnergyCost
	 * @param elevation
	 * @param radiation
	 */
	public LowArea(double basicEnergyCost,double elevation,double radiation){
		super(basicEnergyCost,elevation,radiation);
	}
	
	/**
	  * Overridden method for calculating total consumed energy.
	  * @return getBasicEnergyCost*2 int
	  */
	public double calcConsumedEnergy() {
		// TODO Auto-generated method stub
		return getBasicEnergyCost() * 2;
	}
}

package edu.wmich.cs1120.la5;

public abstract class Area implements IArea{

	private double basicEnergyCost;
	private double elevation;
	private double radiation;
	
	/**
	 * Default constructor for area.
	 */
	public Area(){
		
	}
	
	/**
	 * Constructor for area for convenience.
	 * @param basicEnergyCost - basic energy cost to go though the area.
	 * @param elevation - elevation of the area.
	 * @param radiation - radiation of the area.
	 */
	public Area(double basicEnergyCost,double elevation,double radiation){
		this.basicEnergyCost = basicEnergyCost;
		this.elevation = elevation;
		this.radiation = radiation;
	}
	/**
	 * Get basic energy cost from area.
	 * @return basic energy cost.
	 */
	@Override
	public double getBasicEnergyCost() {
		// TODO Auto-generated method stub
		return basicEnergyCost;
	}

	/**
	 * Set basic energy cost for area.
	 * @param basicEnergyCost
	 */
	@Override
	public void setBasicEnergyCost(double basicEnergyCost) {
		// TODO Auto-generated method stub
		this.basicEnergyCost = basicEnergyCost;
		
	}

	/**
	 * Get elevation from area.
	 * @return elevation
	 */
	@Override
	public double getElevation() {
		// TODO Auto-generated method stub
		return elevation;
	}

	/**
	 * Set elevation for area.
	 * @param elevation
	 */
	@Override
	public void setElevation(double elevation) {
		// TODO Auto-generated method stub
		this.elevation = elevation;
	}

	/**
	 * Get radiation from area.
	 * @return radiation
	 */
	@Override
	public double getRadiation() {
		// TODO Auto-generated method stub
		return radiation;
	}

	/**
	 * Get radiation set for the area.
	 * @param radiation
	 */
	@Override
	public void setRadiation(double radiation) {
		// TODO Auto-generated method stub
		this.radiation = radiation;
	}

	/**
	 * Calculate the energy cost to go through the area.
	 * @return energy cost
	 */
	@Override
	public double calcConsumedEnergy() {
		// TODO Auto-generated method stub
		return 0;
	}

}

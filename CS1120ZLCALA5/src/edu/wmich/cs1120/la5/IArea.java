package edu.wmich.cs1120.la5;
/**
 * Sets the basic structure for Area class
 * @author Zhixiang Li
 *
 */
public interface IArea {
	/**
	 * Get basic energy cost from area.
	 * @return basic energy cost.
	 */
	double getBasicEnergyCost();

	/**
	 * Set basic energy cost for area.
	 * @param basicEnergyCost
	 */
	void setBasicEnergyCost(double basicEnergyCost);

	/**
	 * Get elevation from area.
	 * @return elevation
	 */
	double getElevation();

	/**
	 * Set elevation for area.
	 * @param elevation
	 */
	void setElevation(double elevation);

	/**
	 * Get radiation from area.
	 * @return radiation
	 */
	double getRadiation();

	/**
	 * Get radiation set for the area.
	 * @param radiation
	 */
	void setRadiation(double radiation);

	/**
	 * Calculate the energy cost to go through the area.
	 * @return energy cost
	 */
	double calcConsumedEnergy();
}

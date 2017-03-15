package edu.wmich.cs1120.la5;
/**
 * Interface for MapCreator class
 */
import java.io.IOException;

public interface IMapCreator {
	/**
	 * Scan terrain, read file. Declare low/high area base on radiation. Read area object to 2D array.
	 * @param fileName
	 * @param threshold
	 * @throws IOException - need this for reading files.
	 */
	public void scanTerrain(String fileName, int threshold) throws IOException;

	/**
	 * Get terrain scanner.
	 * @return Scanner
	 */
	public TerrainScanner getScanner();

	/**
	 * Set Scanner for TerrainScanner.
	 * @param scanner
	 */
	public void setScanner(TerrainScanner scanner);
}

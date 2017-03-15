package edu.wmich.cs1120.la5;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MapCreatorFromTxt implements IMapCreator {

	private TerrainScanner scanner = new TerrainScanner();
	private Area[][] area;
	
	/**
	 * Scan terrain, read file. Declare low/high area base on radiation. Read area object to 2D array.
	 * @param fileName
	 * @param threshold
	 * @throws IOException - need this for reading files.
	 */
	@Override
	public void scanTerrain(String fileName, int threshold) throws IOException {
		// TODO Auto-generated method stub
		File input = new File("Terrain.txt");
		Scanner theFile = new Scanner(input);
		String theLine;
		String[] splitLine = new String[3];
		area = new Area[10][10];
		int i = 0;
		int n = 0;
		double[] basicEnergyCost = new double[100];
		double[] elevation = new double[100];
		double[] radiation = new double[100];
		
		while(theFile.hasNext()){
			if(n == 10){
				n = 0;
				i++;
			}
			theLine = theFile.nextLine();
			splitLine = theLine.split(" ");
			basicEnergyCost[i] = Double.parseDouble(splitLine[0]);
			elevation[i] = Double.parseDouble(splitLine[1]);
			radiation[i] = Double.parseDouble(splitLine[2]);
			if(radiation[i] >= 0.5 || (radiation[i] < 0.5 && elevation[i] > threshold * 0.5)){
				Area highArea = new HighArea(basicEnergyCost[i],elevation[i],radiation[i]);
				area[i][n] = highArea; 
			}
			else{
				Area lowArea = new LowArea(basicEnergyCost[i],elevation[i],radiation[i]);
				area[i][n] = lowArea; 
			}
			n++;
		}
		scanner.setTerrain(area);
		theFile.close();
		
	}

	/**
	 * Get terrain scanner.
	 * @return Scanner
	 */
	@Override
	public TerrainScanner getScanner() {
		// TODO Auto-generated method stub
		return scanner;
	}

	/**
	 * Set Scanner for TerrainScanner.
	 * @param scanner
	 */
	@Override
	public void setScanner(TerrainScanner scanner) {
		// TODO Auto-generated method stub
		this.scanner = scanner;
		
	}

}

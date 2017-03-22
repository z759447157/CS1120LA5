package edu.wmich.cs1120.la5;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

public class MapCreatorFromDat implements IMapCreator{

	private TerrainScanner scanner = new TerrainScanner();
	private Area[][] area = new Area[10][10];
	@Override
	public void scanTerrain(String fileName, int threshold) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream file_in = new FileInputStream("Terrain.dat");
        DataInputStream data_in = new DataInputStream (file_in );
        int i = 0;
		int n = 0;
        String data;
        String[] splitLine = new String[5];
        double basicEnergyCost;
		double elevation;
		double radiation;
		char operation;
		int val1;
		int val2;
        boolean endOfFile = false;
        
        while(!endOfFile){
        	try{
        		if(n == 10){
    				n = 0;
    				i++;
    			}
        		data=data_in.readUTF();
        		splitLine = data.split(" ");
    			basicEnergyCost = Double.parseDouble(splitLine[0]);
    			elevation = Double.parseDouble(splitLine[1]);
    			radiation = Double.parseDouble(splitLine[2]);
    			operation = splitLine[3].charAt(0);
    			val1 = Integer.parseInt(splitLine[4]);
    			val2 = Integer.parseInt(splitLine[5]);
    			ExpressionFactory.getExpression(operation, val1, val2);
    			if(radiation >= 0.5 || (radiation < 0.5 && elevation > threshold * 0.5)){
    				Area highArea = new HighArea(basicEnergyCost,elevation,radiation);
    				area[i][n] = highArea; 
    			}
    			else{
    				Area lowArea = new LowArea(basicEnergyCost,elevation,radiation);
    				area[i][n] = lowArea; 
    			}
    			n++;
    			
        	}
        	
        	catch(EOFException e){
        		endOfFile=true;
        	}
        }
        scanner.setTerrain(area);
	}

	@Override
	public TerrainScanner getScanner() {
		// TODO Auto-generated method stub
		return scanner;
	}

	@Override
	public void setScanner(TerrainScanner scanner) {
		// TODO Auto-generated method stub
		this.scanner = scanner;
	}

}

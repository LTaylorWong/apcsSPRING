import java.util.*;
import java.io.*;


public class Cows{

    private int R, C E, N;
    //private int[][]field;

    public Cows(int numRows, int numCol, int elevation, int numMoves){
	R=numRows;
	C=numCol;
	field = new int[][]({28,25,20,32,34,36},
			    {27,25,20,20,30,34},
			    {24,20,20,20,20,30},
			    {20,20,14,14,20,20});
	E=elevation;
	N=numMoves;
	
    }
	

	//-------[MAIN]---------------

	public static void main(String args[]){
	    Cows c = new Cows(4,6,22,2);
	}
    
}

import java.util.*;
import java.io.*;


public class Cows{

    private int R, C, E, N;
    private int[][] field;
    private int[] nums;

    public Cows(int numRows, int numCol, int elevation, int numMoves){
	R=numRows;
	C=numCol;
	field = new int[][]{{28,25,20,32,34,36},
			    {27,25,20,20,30,34},
			    {24,20,20,20,20,30},
			    {20,20,14,14,20,20}};
	E=elevation;
	N=numMoves;
	
    }

    public void showLake(){
	for(int r=0;r<field.length;r++){
	    for(int c=0;c<field[r].length;c++){
		System.out.printf("%4d", field[r][c]);
	    }
	    System.out.printf("\n");
	}
    }
    
    public void stomp(int x, int y, int m){
	nums = new int[9];
	int k=x;
	int j=y;
	int p=0;
	while (int p<=9){
	for(int k;k<field.length;k++){
	    for(int j; j<field[k].length;c++){
		nums+=field[k][j];
		p++;
	    }
	}
	}
    

	//-------------[MAIN]---------------

	public static void main(String args[]){
	    Cows c = new Cows(4,6,22,2);
	    c.showLake();
	    
	}
    
}

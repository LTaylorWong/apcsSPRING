import java.io.*;
import java.util.*;

public class Maze {
    private char[][] board;
    private int maxX;
    private int maxY;
    private char wall = ' ';
    private char exit='$';
    private char path='#';
    private char me = 'L';
    private char visited='.';
    private boolean solved=false;
    private myQueue frontier = new myQueue(); 
    
    public void delay(int n){
	try {
	    Thread.sleep(n);
	} catch (Exception e) {}
    }
    public Maze() {
	maxX=40;
	maxY=20;
	board = new char[maxX][maxY];
	
	try {
	    Scanner sc = new Scanner(new File("maze.dat"));
	    int j=0;
	    while (sc.hasNext())
		{
		    String line = sc.nextLine();
		    for (int i=0;i<maxX;i++)
			{
			    board[i][j] = line.charAt(i);
			}
		    j++;
		}
	}
	catch (Exception e)
	    {
	    }
	
    }
	
    public String toString(){
	String s = "[2J\n";
	for (int y=0;y<maxY;y++)
	    {
		for (int x=0;x<maxX;x++)
		    s = s +board[x][y];
		s=s+"\n";
	    }
	
	return s;
    }
    
    
    public void solve(int x, int y){
	frontier.enqueue(x,y);
	frontier.enqueue(x+1,y);
	frontier.enqueue(x,y+1);
	frontier.enqueue(x-1,y);
	frontier.enqueue(x,y-1);
	MazeCurrent current = new MazeNode(x,y);
	
    }
    public static void main(String[] args){
	Maze m = new Maze();
	System.out.println(m);
        m.solve(1,1);
	
    }
    
}


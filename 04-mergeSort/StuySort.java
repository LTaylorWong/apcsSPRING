import java.util.*;
import java.io.*;


public class StuySort{
    private ArrayList<Integer> A = new ArrayList<Integer>();
    private ArrayList<Integer> B = new ArrayList<Integer>();


    public StuySort(){
	A.add(1);
	A.add(3);
	A.add(5);
	A.add(7);
	A.add(22);
	B.add(2);
	B.add(3);
	B.add(7);
	B.add(10);
	B.add(22);
    }
    public ArrayList<Integer> merge(ArrayList<Integer> A, ArrayList<Integer> B){
	ArrayList<Integer> ai = new ArrayList<Integer>();
	while (A.size()>0 && B.size()>0){
	    if (A.get(0) <= B.get(0)){
		ai.add(A.get(0));
	    } else{
		ai.add(B.get(0));
	    }
	} return ai;
    }


    //------------[Main]-----------
    public static void main(String args[]){
	StuySort s = new StuySort();
	System.out.println(s.merge(s.A, s.B));
    }
    
}

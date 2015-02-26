import java.util.*;
import java.io.*;


public class StuySort{
    private ArrayList<Integer> A = new ArrayList<Integer>();
    private ArrayList<Integer> B = new ArrayList<Integer>();

   
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
	System.out.println(ms.merge([1,3,5,7,22],[2,3,7,10,25]));
    }
    
}

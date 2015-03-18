import java.io.*;
import java.util.*;
import java.lang.System;

public class Test{
    public static void main(String[] args){
	long t= System.currentTimeMillis();
	System.out.println(t);
	
	long start, elapsed;

	start= System.currentTimeMillis();
	LinkedList<Integer> LL = new LinkedList<Integer>();
	Random r = new Random();
	int n = 10;
	//adding to new LinkedList
	for (int i=0;i<n;i++){
	    int k=r.nextInt(10);
	    LL.add(k);
	}
	System.out.println(LL);
	//

	elapsed= System.currentTimeMillis()-start;
    }
}

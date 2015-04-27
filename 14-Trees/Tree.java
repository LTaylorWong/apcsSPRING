import java.io.*;
import java.util.*;

public class Tree{
    
    Node r;

    public node search(Node T, Integer i){
	while (T!=null){
	    int c=T.getData().compareTo(i);
	    if (c>0){
		T=T.getRight();
	    }else if (c<0){
		T=T.getLeft;
	    }else return T;
	}
	return null;
    }

  
    public void insert(Node t, int i) {
	//Node tmp = new Node();
	//tmp.setData(i);
	Node T = t;
	Node T2;
	if (i < T.getData()) {
	    T2 = T.getLeft();
	} else {
	    T2 = T.getRight();
	}
	while (T != null) {
	    if (i < T.getData()) {
		T2 = T;
		T = T.getLeft();
	    } else {
		T2 = T;
		T = T.getRight();
	    }
	}
	if (i < T2.getData()) {
	    T2.setLeft(i);
	} else {
	    T2.setRight(i);
	}
    }

       public Node search(Node t, int i) {
	Node T = t;
	Node T2;
	if (i == T.getData()) {
	    return T;
	} else if (i < T.getData()) {
	    T2 = T.getLeft();
	} else {
	    T2 = T.getRight();
	}
	while (T != null) {
	    if (i == T.getData()) {
		return T;
	    } else if (i < T.getData()){
		T2 = T;
		T = T.getLeft();
	    } else {
		T2 = T;
		T = T.getRight();
	    }
	}
	return null;
	// if (i = T2.getData()) {
	//     T2.setLeft(i);
	// } else {
	//     T2.setRight(i);
	// }
    }
}

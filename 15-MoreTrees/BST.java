import java.io.*;
import java.util.*;
public class BST{
    Node r;
    
    public Node search(Node t, int i){
	if (t==null || t.getData()==i){
	    return t;
	}
	else if (i<t.getData()){
	    return search(t.getLeft(),i);
	} else {
	    return search(t.getRight(),i);
	}
    }

    public String search(int i){
	Node n = search(r,i);
	if (n==null){
	    return "NOT FOUND";
	}else{
	    return n.toString();
	}
    }
    
    public void insert(int i){
	Node n = new Node(i);
	Node t2=null;
	Node t = r;
	if (r==null){
	    r=n;
	    return;
	}
	
	while (t!=null){
	    t2 = t;
	    if (t.getData()==i)
		return;
	    else if (t.getData() < i)
		t=t.getRight();
	    else if (t.getData() > i)
		t=t.getLeft();
	    else
		return;
	}

	
	if (i>t2.getData())
	    t2.setRight(n);
	else
	    t2.setLeft(n);
    }
    
    public int numNodes(Tree T){
	if (T==null){
	    return 0;
	}else{
	    T.getData()+numNodes(T.getLeft())+numNodes(T.getRight());
	}
    }

    //max value from tree
    public int maxVal(Node T){
	//get the farthest right val
	if (T==null){
	    return 0;
	}else{
	    return max(maxVal(T.getRight()),
		       maxVal(T.getLeft()),
		       maxVal(T.getData());
	  
	}
	    
    }
    
    //height
    public int height(Tree T){
	if (T==null){
	    return 0;
	}else {
	    return 1+ max(height(T.getLeft()),
			  height(T.getRight()));
	}
    }
    //longest leaf to leaf path
    public int diameter(Tree T){
	if(T==null){
	    return 0;
	}else{
	   int  pl1 = height(T.getLeft())+height(T.getRight())*2;
	   int  pl2 = diameter(T.getLeft());
	   int  pl3 = diameter(T.getRight());
	   return max(pl1,pl2,pl3);
	}
    }
    /* Tree:
                3
	    /       \
	   7         12
	  / \        / \
       15     8     17 19
       / \   / \    / 
       16 22 13 21 30
     */
    /* split dupes:
       parent and leaf have the same value--->
       inserts a new node between them that is one less than that value
     */
    public void splitDupes(Tree T){
    }
		
		
    //-------------[Main]---------------    
    public static void main(String[] args){
	BST t = new BST();
	Random r = new Random();
	for (int i = 0; i < 20; i ++){
	    int z = r.nextInt(100);
	    //System.out.println(z);
	    t.insert(z);
	}
	t.insert(30);
	System.out.println(t);
	System.out.println(t.search(30));
    }

}






								


		

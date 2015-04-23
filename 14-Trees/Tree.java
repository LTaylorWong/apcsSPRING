public class Tree{
    
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
}

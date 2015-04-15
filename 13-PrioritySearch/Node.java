
public class Node {
    private int x,y;
    private Node prev;
    
    public Node(int x, int y){
	this.x = x;
	this.y = y;
    }
    
    public Node getPrev() {
	return prev;
    }
    
    public void setPrev(Node n){
	prev = n;
    }
    
    public int getX() {
	return x;
    }
    
    public int getY() {
	return y;
    }
    
    public double calcEuclidean(int exitX, int exitY){
	int retX, retY;
	double priority;
	retX = exitX-x;
	retX = retX*retX;
	retY = exitY-y;
	retY = retY*retY;
	priority = Math.sqrt(retX+retY);
	return priority;
	
    }

    public double calcManhattan(int exitX, int exitY){
	int retX, retY;
	double priority;
	retX = exitX-x;
	retX = Math.abs(retX);
	retY = exitY-y;
	retY = Math.abs(retY);
	priority = retX+retY;
	return priority;
    }

		
}











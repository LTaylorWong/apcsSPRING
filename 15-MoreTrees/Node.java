public class Node {
 
    private int data;
    private Node left,right;

    public Node () {
	data = 0;
	left = null;
	right = null;
    }
    public int getData() {
	return data;
    }
    public Node getLeft() {
	return left;
    }
    public Node getRight() {
	return right;
    }
    public void setData(int x) {
	data = x;
    }

    public void setLeft(int x) {
	Node tmp = new Node();
	tmp.setData(x);
	left = tmp;
    }

    public void setRight(int x) {
	Node tmp = new Node();
	tmp.setData(x);
	right = tmp;
    }

}

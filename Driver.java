public class Driver{

    public static void main(String[]args){
	Node n = new Node("hello");
	//System.out.println(n);

	Node n2 = new Node("world");
	//Stystem.out.println(n2);

	n.setNext(n2);
	System.out.println(n.getNext().getData());
	System.out.println(n.getNext());
		
}
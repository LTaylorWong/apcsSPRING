public class LL {
    
    private Node start,end;
    private int len;
    
    public LList() {
	start = new Node("");
	end = null;
	start.setNext(end);
	len = 0;
    }

    public void add(String s){
	Node temp = new Node(s);
        start.setNext(temp);
	temp.setNext(end);
	end = temp;
	len++;
    }

    public Node get(int n) {
	Node temp = start;
	int counter = -1;
	while(counter < n && temp != null) {
	    temp = temp.getNext();
	    counter++;
	}
	return tmp;
    }

    public void add(int n, String s) {
	Node add = new Node(s);
	Node before = get(n - 1);
	System.out.println(before);
	Node after = get(n);
	System.out.println(after);
	add.setNext(after);
	before.setNext(add);	
    }

    public void remove(int n) {
	if(n>=this.len||n<0)
	    return;
	Node temp = start;
	for(int i=0; i<n-1;i++){
	    temp=temp.getNext();
	}
	String s = temp.getNext().getData();
	temp.setNext(temp.getNext().getNext());
	return s;
    }
    
    public int getLength() {
	return len;
    }
    
    public String toString(){
	String s = "null --> ";
	Node temp;
	for (tmp = start.getNext(); tmp != null; temp = temp.getNext()){
	    s = s + temp + " --> ";
	}
	s = s + "null";
	return s;
    }
    
}

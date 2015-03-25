public class myQueue{

    public Node<E> start;
    public Node<E> end;

    public myStack(){
      	start= null;
	end=null;
	start.setNext(end);
    }

    public void enqueue(E data){
	Node<E> tmp=new Node<E>(data);
	end.setNext(tmp);
	end=tmp;
	//adding to the back
    }

    public E dequeue(){
	E tmp= start.getData();
	start=start.getNext();
	return tmp;
	}

    public boolean empty(){
	return start=null;
    }

    public E head(){
	E tmp= start.getData();
	return tmp;
    }
    
}

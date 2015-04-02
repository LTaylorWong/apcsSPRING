
import java.util.*;

public class myQueue<E> {

    private Node<E> head;
    private Node<E> tail;
    private int size;

    public myQueue(){
	head = new Node<E>();
	tail = head;
	size = 0;
    }

    public void enqueue(int x, int y){
	Node<E> tmp = new Node<E>(data);
	if (size == 0){
	    head = tmp;
	    tail = tmp;
	}
	else {
	    tail.setNext(tmp);
	    tail = tmp;
	}
	size++;
    }

    public int[] dequeue(){
	if (empty())
	    throw new NoSuchElementException();
	int[] data = head.getData();
	if (head == tail){
	    head.setData(null);
	    tail.setData(null);
	}
	else
	    head = head.getNext();
	size--;
	return data;
    }

    public boolean empty(){
	return ((head == tail) && (head.getData() == null));
    }

    public int[] head(){
	if (empty())
	    throw new NoSuchElementException();
	int[] data = head.getData();
	return data;
    }

    public int size(){
        return size;
    }

    public String toString(){
	String s = "";
	Node<E> iter = head;
	while (iter != null){
	    s+= iter + " --> ";
	    iter = iter.getNext();
	}
	return s;
    }

}

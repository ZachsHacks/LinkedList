
//Custom LinkedList created using generics by Zachary Shale Weiss

public class MyLinkedList<T> {

	T current;
	MyLinkedList<T> next;

	//set initial values to NULL
	public MyLinkedList() {
		current = null;
		next = null;
	}

	//Recursively add a node to the end of the linked list.
	public void add(T value) {
		if(current == null) {
			current = value;
			next = new MyLinkedList<T>();
		} else next.add(value);
	}

	//Perform a linear search to find a particular node.
	public T get(int index) {
		if(index == 0) return current;
		return next.get(index-1);
	}

	//Get the size of the list.
	public int size() {
		if (current == null) return 0;
		else return next.size() + 1;
	}

	//Recursively check for particular value
	public boolean contains(T value) {
		if (current == null) return false;

		if (current.equals(value)) return true;
		else return next.contains(value);
	}

}

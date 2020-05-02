
public class LinkedList {
	
	Node head = null;
	Node tail = null;

	int size;
	
	//=========================================
	//Name: LinkedList()
	//Description: default constructor
	//=========================================
	public LinkedList() {
		
	}
	
	//=========================================
	//Name: LinkedList(Object element)
	//Description: default constructor
	//=========================================
	public LinkedList(Object element) {
		
		head = new Node(element);
		tail = head;
		
	}
	
	//=========================================
	//Name: add(Object element)
	//Description: add element to end of LL
	//=========================================
	public void add(Object element) {
		
		if(head == null) {
			head = new Node(element);
			tail = head;
			size ++;
		}
		else {
			Node temp = new Node(element);
			tail.next = temp;
			temp.previous = tail;
			tail = temp;
			size ++;
		}
		
	}
	
	
	//=========================================
	//Name: toString()
	//Description: Prints out elements of LL
	//=========================================
	public String toString() {
		
		String output = "";
		Node current = head;
		while(current.next != null) {
			output += current.element + " ";
			current = current.next;
		}
		
		output += current.element + " ";
		
		return output;
		
	}
	
	
	//=========================================
	//Name: getTail()
	//Description: returns the tail
	//=========================================
	public Object getTail() {
		return tail.element;
	}
	
	
	//=========================================
	//Name: getHead()
	//Description: returns the head
	//=========================================
	public Object getHead() {
		return head.element;
	}
	
	//=========================================
	//Name: addFirst(Object element)
	//Description: adds an element as the head
	//=========================================	
	public void addFirst(Object element) {
		Node temp = new Node(element);
		
		temp.next = head;
		head.previous = temp;
		head = temp;
		size++;
		
	}
	
	//=========================================
	//Name: addIndex(int index, Object element)
	//Description: adds an element at a specific 
	//spot in the list
	//=========================================
	public void addIndex(int index, Object element) {
		
		if(index < 0 || index >= size) {
			
		}
		if(index == 0) {
			addFirst(element);
		}
		else {
			
			Node current = head;
			
			for(int i = 1; i < index; i++) {
				current = current.next;
			}
			Node temp = new Node(element);
			temp.next = current.next;
			temp.previous = current;
			current.next = temp;
			temp.next.previous = temp;
			size ++;
			
			
		}
	}
	
	//=========================================
	//Name: removeObject()
	//Description: removes an Object at the end
	//of the LL
	//=========================================
	public Object remove() {
		
		Node previous = tail.previous;
		
		tail.previous = null;
		previous.next = null;
		
		Node temp = tail;
		tail = previous;
		size --;
		return temp.element;
		
		
	}
	
	//=========================================
	//Name: removeIndex(int index)
	//Description: removes an Object at the specific
	//index
	//=========================================
	public Object removeIndex(int index) {
		
		if (index < 0 || index >= size) {
			return null;
		}
		
		Node current = head;
		for(int i = 1; i < index; i++) {
			current = current.next;
		}
		
		Node temp = current.next;
		temp.next.previous = temp.previous;
		temp.previous.next = temp.next;
		
		
		return temp.element;
	}

}


public class LinkedList {
	
	Node head  = null;
	Node tail = null;
	public int size = 0;
	
	
	//=========================================
	//Name: constructor()
	//Description: default constructor
	//=========================================
	public LinkedList() {
		
	}

	//=========================================
	//Name: constructor(Object element)
	//Description: default constructor adds a head
	//=========================================
	public LinkedList(Object element) {
		
		head = new Node(element);
		tail = head;
		size ++;
		
	}
	
	//=========================================
	//Name: add(Object element)
	//Description: adds an element to LL
	//=========================================
	public void add(Object element) {
		
		if(head == null) {
			head = new Node(element);
			tail = head;
			size++;
		}
		else {
			
			Node temp = new Node(element);
			temp.next = tail.next;
			tail.next = temp;
			tail = temp;
			size ++;			
			
		}
	}
		
	//=========================================
	//Name: addFirst(Object element)
	//Description: add a new object at head
	//=========================================
	public void addFirst(Object element) {
		
		if (head == null) {
			head = new Node(element);
			tail = head;
			size++;
		}
		else {
			
			Node temp = new Node(element);
			temp.next = head;
			head = temp;
			tail.next = head;
			size ++;
		}
		
		
	}
	
	
	//=========================================
	//Name: remove()
	//Description: removing the tail
	//=========================================
	public Object remove() {
		
		if(size == 0) {
			return null;
		}
		if(size == 1 ) {
			Node temp = tail;
			tail = null;
			head = null;
			size --;
			return temp.element;
		}
		else {
			Node current = head;
			for(int i = 1; i < size -1; i++) {
				current = current.next;
			}
			Node temp = tail;
			
			current.next = tail.next;
			tail = current;
			
			size --;
			return temp.element;
			
			
		}
		
	}
	
	//=========================================
	//Name: removeIndex(int index)
	//Description: remove element at specific 
	//index
	//=========================================
	public Object removeIndex(int index) {
		
		if(index < 0 || index >= size){
			return null;
		}
		else {
			Node current = head;
			for(int i = 1; i < index; i ++) {
				current = current.next;
			}
			Node temp = current.next;
			
			current.next = temp.next;
			size --;
			return temp.element;
			
		}
		
	}
	
	
	//=========================================
	//Name: toString()
	//Description: print LL out
	//=========================================
	public String toString() {
		
		String output = "";
		
		Node current = head;
		while(current != tail) {
			output += current.element + " ";
			current = current.next;
		}
		
		output += tail.element;
		
		return output;
	}
	
	//=========================================
	//Name: getHead()
	//Description: return head
	//=========================================
	public Object getHead() {
		return head.element;
	}
	
	//=========================================
	//Name: getTail()
	//Description: return tail
	//=========================================
	public Object getTail() {
		return tail.element;
	}

	
	//=========================================
	//Name: getIndex()
	//Description: get element at particular index
	//=========================================
	public Object getIndex(int index) {
		
		if(index < 0 || index >= size) {
			return null;
		}
		else {
			Node current = head;
			for(int i = 1; i < index; i++) {
				
				current = current.next;
				
			}
			
			return current.next.element;
		}
		
		
		
	}


}

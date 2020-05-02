//Implementing a Singular Linked List
public class LinkedList {
	
	Node head = null;
	public int size = 0;
	
	//=========================================
	//Name: LinkedList() default Constructor
	//Description: Constructor that does nothing
	//=========================================
	public LinkedList() {
		
	}
	
	//=========================================
	//Name: LinkedList(Object element) 
	//Description: Constructor that starts linked
	//list
	//=========================================
	public LinkedList(Object element) {
		
		head = new Node(element);
		size++;
		
	}
	
	//=========================================
	//Name: add(Object element)
	//Description: adds an element to linked list
	//=========================================
	public void add(Object element) {
		
		if(size == 0) {
			head = new Node(element);
		}
		else {
			
			Node current = head;
			
			while(current.next != null) {
				
				current = current.next;
				
			}
			
			current.next = new Node(element);
		}
		size++;
		
	}
	
	//=========================================
	//Name: add(Object element)
	//Description: adds an element to linked list
	//at a specific index
	//=========================================
	public void add(int index, Object element) {
		
		if( (index < 0) || index >= size) {
			
			//do nothing
			
		}
		else if (index == 0) {
			
			Node temp = new Node(element);
			temp.next = head;
			head = temp;
			size++;
			
		}
		else {
			Node current = head;
			for(int counter = 1; counter < index; counter ++){
				
				current = current.next;
				
			}
			Node temp = new Node(element);
			temp.next = current.next;
			current.next = temp;
			size++;
			
		}
		
		
		
		
		
	}
	
	//=========================================
	//Name: print()
	//Description: prints elements of the linked
	//list
	//=========================================
	public String print() {
		
		Node current = head;
		String output = "Here is the contents of my linked list: ";
		
		
		while(current.next != null) {
			output += " " + current.element;
			current = current.next;
		}
		//for(int index = 0; index < size; index ++) {
		//	output += " " + current.element;
		//	current = current.next;
			
		//}
		
		output += " " + current.element;
		
		return output;
		
	}
	
	
	//=========================================
	//Name: remove()
	//Description: remove element from linked list
	//=========================================
	public Object remove() {
		
		Node temp = null;
		Node current = head;
		
		for(int index = 0; index < size - 2; index ++) {
			
			current = current.next;
			
		}
		temp = current.next;
		current.next = null;
		
		size --;
		
		return temp.element;
		
	}
	
	
	//=========================================
	//Name: remove(int index)
	//Description: remove an element to linked list
	//at a specific index
	//=========================================
	public Object remove(int index) {
		
		Node temp = null;
		Node current = head;

		
		if((index < 0) || (index >= size)) {
			//out of range
			return null;
			
		}
		else if(index == 0) {
			temp = head;
			head = head.next;
			size --;
		}
		else {
		
			for(int count = 1; count < index; count ++) {
				
				current = current.next;
				
			}
			temp = current.next;
			current.next = temp.next;
			
			size --;
			
		}
		return temp.element;
		
	}
	
	
	//=========================================
	//Name: clear()
	//Description: clears the list
	//=========================================
	public void clear() {
		head = null;
	}

	//=========================================
	//Name: getFirst()
	//Description: gets the first element of the
	//linked list
	//=========================================
	public Object getFirst() {
		if (head ==null) {
			return null;
		}
		return head.element;
	}
	
	//=========================================
	//Name: getLast()
	//Description: gets the last element of the
	//linked list
	//=========================================
	public Object getLast() {
		
		if (head == null) {
			return null;
		}
		
		Node current = head;
		
		while(current.next != null) {
			current = current.next;
		}
		
		return current.element;
		
	}
	
	
	//=========================================
	//Name: addFirst(int element)
	//Description: adds an element at the beginning
	//of the list
	//=========================================
	public void addFirst(int element) {
		
		if(head == null) {
			head = new Node(element);
		}
		else {
			Node temp = new Node(element);
			temp.next = head;
			head = temp;
			
		}
		size ++;
					
	}
	
	
	//=========================================
	//Name: addLast(int element)
	//Description: adds an element at the end
	//of the list
	//=========================================
	public void addLast(int element) {
		
		if (head == null) {
			head = new Node(element);
		}
		else {
			
			Node current = head;
			while(current.next != null) {
				current = current.next;
			}
			
			current.next = new Node(element);
		}
		
		size ++;
		
		
	}
	
	//=========================================
	//Name: removeFirst()
	//Description: removes the first element
	//of the list
	//=========================================
	public Object removeFirst() {
		if(head == null)
		{
			return null;
		}
		if(size == 1){
			Node temp = head;
			head = null;
			size --;
			return temp.element;
		}
		else {
			Node temp = head;
			head = head.next;;
			size --;
			return temp.element;
			
		}
	}
	
	
	//=========================================
	//Name: removeLast()
	//Description: removes the last element
	//of the list
	//=========================================
	public Object removeLast() {
		
		Node current = head;
		for(int i = 1; i < size -1; i++) {
			current = current.next;
		}
		
		Node temp = current.next;
		current.next = null;
		size --;
		
		return temp.element;

	}
	
	//=========================================
	//Name: removeIndex(int index)
	//Description: removes the element at a 
	//specific index
	//=========================================
	public Object removeIndex(int index) {
		
		//check if index is within bounds
		if(index < 0 || index >= size) {
			return null;
		}
		if(index == 0) {
			removeFirst();
		}
		if(index == size -1) {
			removeLast();
		}
		
		Node current = head;
		
		for (int i = 1; i < index; i ++) {
			current = current.next;
		}
		
		Node temp = current.next;
		current.next = temp.next;
		size --;
		
		return temp.element;
		
		
	}
	
	//=========================================
	//Name: contains(Object element)
	//Description: checks to see if the list
	//contains this specific element
	//=========================================
	public boolean contains(Object element) {
		
		if (head == null) {
			return false;
		}
		
		Node current = head;

		
		for(int i =1; i <= size - 1; i ++) {

			if(current.element == element) {
				return true;
			}
			current = current.next;

		}

		if(current.element != element) {

			return false;
		}else {

			return true;
		}
		
		
	}
	
	

}

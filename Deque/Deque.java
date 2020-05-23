
public class Deque {
	
	Node head = null;
	Node tail = null;


	//===================================================
	//Name: addFirst
	//Description: adds an element to the head of the queue
	//===================================================
	public void addFirst(String data) {
		
		Node newNode = new Node(data);
		
		if(head == null) {
			//throw new Exception("Queue is empty");
			head = newNode;
			tail = newNode;
		}
		else {
			newNode.next = head;
			head = newNode;
			
		}

	}
	
	//===================================================
	//Name: addLast
	//Description: adds an element to the tail of the queue
	//===================================================
	public void addLast(String data) {
		
		Node newNode = new Node(data);
		
		if(tail == null) {
			//throw new Exception("Queue is empty");
			tail = newNode;
			head = newNode;
		}
		else {
			tail.next = newNode;
			tail = newNode;
			
		}

	}
	
	//===================================================
	//Name: offerFirst
	//Description: adds an element to the head of the queue
	//if there is capacity
	//===================================================
	public boolean offerFirst(String data) {
		
		Node newNode = new Node(data);
		
		if(head == null) {
			//throw new Exception("Queue is empty");
			head = newNode;
			tail = newNode;
		}
		else {
			newNode.next = head;
			head = newNode;
			
		}
		return true;
	}
	
	
	//===================================================
	//Name: offerLast
	//Description: adds an element to the tail of the queue
	//if there is capacity
	//===================================================
	public boolean offerLast(String data) {
		
		Node newNode = new Node(data);
		
		if(tail == null) {
			//throw new Exception("Queue is empty");
			tail = newNode;
			head = newNode;
		}
		else {
			tail.next = newNode;
			tail = newNode;
			
		}
		return true;

	}
	
	
	//===================================================
	//Name: empty
	//Description: checks if deque is empty
	//===================================================
	public boolean empty() {
		
		return (head == null);
		
	}
	
	
	//===================================================
	//Name: peekFirst
	//Description: get the head 
	//===================================================
	public String peekFirst() {
		
		if(head == null) {
			return null;
		}
		else {
			return head.data;
		}

	}
	
	//===================================================
	//Name: peekLast
	//Description: get the tail 
	//===================================================
	public String peekLast() {
		
		if(tail == null) {
			return null;
		}
		else {
			return tail.data;
		}

	}
	
	//===================================================
	//Name: pollFirst
	//Description: gets the head and removes it from the queue 
	//===================================================
	public String pollFirst() {
		if(head == null) {
			return null;
		}
		else {
			
			String data = head.data;
			head = head.next;
			return data;
			
		}
	}
	
	//===================================================
	//Name: pollLast
	//Description: gets the tail and removes it from the queue 
	//===================================================
	public String pollLast() {
		if(tail == null) {
			return null;
		}
		else {
			
			Node current = head;
			while(current.next != tail) {
				current = current.next;
				
			}
			
			String data = tail.data;
			current.next = null;
			tail = current;
			return data;
			
		}
	}
	
	//===================================================
	//Name: print
	//Description: print elements of the deque ie linked list
	//===================================================
	public void print() {
		
		Node current = head;
		
		while(current != null) {
			
			System.out.println(current.data);
			current = current.next;
		}
		
	}
	

}

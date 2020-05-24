
public class PriorityQueue {
	
	Node head = null;
	Node tail = null;
	
	public void PriorityQueue() {
		
	}
	
	
	//-------------------------------------------------------------	
	//Name: empty
	//Description: check if queue is empty
	//-------------------------------------------------------------
	public boolean empty() {
		return head == null;
	}
	
	
	//-------------------------------------------------------------	
	//Name: pop
	//Description: remove head
	//-------------------------------------------------------------
	public Integer pop() {
		
		if (head == null) {
			return null;
		}
		Node currentNode = head;
		
		head = head.next;
		
		if(head == null) {
			tail = null;
		}
		
		return currentNode.data;
	}
	
	
	//-------------------------------------------------------------	
	//Name: peek
	//Description: see what is at the top of the queue
	//-------------------------------------------------------------
	public Integer peek() {
		if(head == null) {
			return null;
		}
		
		return head.data;
		
	}
	
	
	//-------------------------------------------------------------	
	//Name: push
	//Description: push items onto the stack in ascending order
	//-------------------------------------------------------------
	public void push(Integer data) {
		
		Node newNode = new Node(data);
		
		if (head == null) {
			head = newNode;
			tail = newNode;
		}
		else {
			if(data < head.data) {
				newNode.next = head;
				head = newNode;
			}
			else if(data > tail.data) {
				tail.next = newNode;
				tail = newNode;
			}
			else {
				Node current = head;
				
				while (data > current.next.data) {
					current = current.next;
				}
				newNode.next = current.next;
				current.next = newNode;
				
			}
		}
		
	}
	
	
	//-------------------------------------------------------------	
	//Name: printQueue
	//Description: prints the contents in the queue
	//-------------------------------------------------------------
	public void printQueue() {
		
		Node current = head;
		
		//iterate through queue
		while(current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}

}

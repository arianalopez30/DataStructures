
public class main {

	public static void main(String[] args) {
		
		PriorityQueue pq = new PriorityQueue();
		
		pq.push(62);
		pq.push(33);
		pq.push(99);
		pq.push(4);
		pq.push(50);
		
		System.out.println(pq.peek());
		
		pq.printQueue();

	}

}

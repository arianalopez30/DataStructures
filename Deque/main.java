
public class main {

	public static void main(String[] args) {
		
		//Create deque
		Deque myDeque = new Deque();
		
		myDeque.addFirst("This is my first addition");
		myDeque.addFirst("This is my first addition 2");
		
		System.out.println(myDeque.peekFirst());
		
		myDeque.addLast("This is my last addition");
		myDeque.addLast("This is my last addition 2");
		
		System.out.println(myDeque.peekFirst());
		System.out.println(myDeque.peekLast());
		
		System.out.println("================");
		myDeque.print();
		
		System.out.println("using PollFirst: " + myDeque.pollFirst());
		
		System.out.println("================");
		myDeque.print();
		

	}

}

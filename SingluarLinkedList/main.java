
public class main {

	public static void main(String[] args) {
		
		LinkedList a = new LinkedList();
		
		a.add(10);
		a.add(3);
		a.add(23);
		//a.add(0, 22);
		a.add(2);
		a.add(46);
		
		System.out.println("size " + a.size);
		System.out.println(a.print());
		
		System.out.println("================");
		System.out.println(a.remove());
		System.out.println(a.print());
		System.out.println("size " + a.size);
		
		
		System.out.println("================");
		System.out.println(a.removeFirst());
		System.out.println(a.print());
		System.out.println("size " + a.size);
		
		System.out.println("================");
		System.out.println(a.removeLast());
		System.out.println(a.print());
		System.out.println("size " + a.size);
		
		System.out.println("================");
		//Test adds
		a.add(99);
		System.out.println(a.print());
		System.out.println("size " + a.size);
		
		System.out.println("================");
		a.add(2, 33);
		System.out.println(a.print());
		System.out.println("size " + a.size);
		
		System.out.println("================");
		a.add(54, 33);
		System.out.println(a.print());
		System.out.println("size " + a.size);
		
		//get values
		System.out.println(a.getFirst());
		
		System.out.println(a.getLast());
		
		System.out.println("================");
		System.out.println("================");
		System.out.println("Looking for 3");
		System.out.println(a.contains(3));
		System.out.println("================");
		System.out.println("================");
		System.out.println("Looking for 99");
		System.out.println(a.contains(99));
		System.out.println("================");
		System.out.println("================");
		System.out.println("Looking for 0");
		System.out.println(a.contains(0));
		
		//System.out.println(a.remove(0).element);
		
		//System.out.println(a.remove().element);
		
		//System.out.println(a.print());

	}

}

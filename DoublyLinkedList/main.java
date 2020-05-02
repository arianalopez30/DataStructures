
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList a = new LinkedList();
		
		a.add(47);
		a.add(33);
		a.add(3);
		
		System.out.println(a.toString());
		
		System.out.println("get tail " + a.getTail());
		a.addFirst(0);
		System.out.println(a.toString());
		System.out.println("get head " + a.getHead());
		
		a.addIndex(2, 22);
		System.out.println(a.toString());
		
		System.out.println(a.remove());
		System.out.println(a.toString());
	}

}

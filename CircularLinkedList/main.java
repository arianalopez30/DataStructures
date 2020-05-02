
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList a = new LinkedList();
		
		a.add(33);
		
		a.add(20);
		
		a.add(11);
		a.add(34);
		
		System.out.println(a.toString());
		
		a.addFirst(1);
		
		System.out.println(a.toString());
		
		System.out.println(a.removeIndex(2));
		
		System.out.println(a.toString());
		
		System.out.println(a.getIndex(3));
		System.out.println(a.toString());
		
		
	}

}

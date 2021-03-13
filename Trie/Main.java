
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create list of words
		String myArray[] = {"car", "cards", "tree", "trees"};
		Trie t = new Trie();
		
		for(String item : myArray) {
			t.insert(item);
		}
		
		System.out.println(t.search("car"));
		
		System.out.println(t.search("cars"));
		
		System.out.println(t.search("trie"));
		
		System.out.println(t.search("tree"));
		
		t.delete("tree");
		
		System.out.println("Deleting tree");
		System.out.println(t.search("tree"));
		
		//System.out.println(t.search("trie"));
		System.out.println(t.search("car"));
		System.out.println(t.search("trees"));
		
		System.out.println("Does trie contain prefix: ca - " + t.prefix("ca"));
		System.out.println("Does trie contain prefix: car - " + t.prefix("car"));
		
		System.out.println("Does trie contain prefix: tra - " + t.prefix("tra"));
		
		System.out.println("Does trie contain prefix: pre - " + t.prefix("pre"));

		

	}

}

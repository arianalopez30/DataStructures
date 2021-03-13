import java.util.HashMap;

public class Node {
	
	public HashMap <Character, Node> children;
	public boolean isCompleteWord;
	public Character letter;
	
	public Node() {
		children = new HashMap<Character, Node>();
		boolean isCompleteWord = false;
		letter = null;
		
	}
	
	public Node(Character c) {
		children.put(c, new Node());
		boolean isCompleteWord = false;
		letter = c;
	}

}

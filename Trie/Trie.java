
public class Trie {

	private Node root;
	
	public Trie() {
		root = new Node();
	}
	
	public void insert(String word) {
		
		Node current = root;
		
		for(int i = 0; i < word.length(); i++) {
			
			Character c = word.charAt(i);
			
			if(current.children.containsKey(c)) {
				current = current.children.get(c);
			}
			else {
				current.children.put(c, new Node());
				current = current.children.get(c);
			}
			
		}
		
		current.isCompleteWord = true;
		
	}
	
	
	public boolean search(String word) {
		
		boolean isFound = false;
		Node current = root;
		
		for(int i = 0; i < word.length(); i++) {
			
			Character c = word.charAt(i);
			
			if(current.children.containsKey(c)) {
				current = current.children.get(c);
				
				if((i == word.length() - 1 ) && current.isCompleteWord == true) {
					isFound = true;
				}
			}
			else {
				return isFound;
			}
			
		}
		
		return isFound;
		
		
		
	}
	
	
	public void delete(String word) {
		
		if(word.length() == 0 || word == null) {
			return;
		}
		
		delete(word, root, 0);
		
		
	}
	
	 
	public boolean delete(String word, Node current, int index) {
		
		boolean canDelete = false;
		//base case
		if(current.isCompleteWord) {
			current.isCompleteWord = false;
			if(current.children.size() > 0) {
				return false;
			}
			else {
				return true;
			}
		}
		
		char letter = word.charAt(index);
		if(current.children.containsKey(letter)) {
			
			Node prev = current;
			current = current.children.get(letter);
			
			canDelete = delete(word, current, index + 1);
			//prev.children.remove(letter);
			if(canDelete) {
				System.out.println("Removing letter: " + letter);
				prev.children.remove(letter);
				if(prev.children.size() > 0) {
					System.out.println(prev.children.size());
					return false;
					
				}
				else {
					return true;
				}
				
			}
			else {
				return false;
			}
			
		}
		else {
			return false; //word doesn't exist
		}

	}
	
	public boolean prefix(String word) {
		
		Character letter;
		boolean isPrefix = false;
		Node current = root;
		
		for(int i = 0; i < word.length(); i++) {
			letter = word.charAt(i);
			
			if(current.children.size() == 0 || current == null || !current.children.containsKey(letter)) {
				return false;
			}
			else {
				current = current.children.get(letter);
			}

			
		}
		return true;
		
	}
	
	
}

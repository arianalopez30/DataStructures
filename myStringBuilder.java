
public class myStringBuilder {

	private char [] myString;
	
	//capacity is how much room is left in the array
	private int DEFAULT_CAPACITY = 16;
	private int capacity = 0;
	private int size = 0;
	
	
	//-------------------------------------------------------------	
	//Name: myStringBuilder()
	//Description: default constructor
	//-------------------------------------------------------------
	public myStringBuilder() {
		
		myString = new char [DEFAULT_CAPACITY];
		capacity = DEFAULT_CAPACITY;
		
	}
	
	
	//-------------------------------------------------------------	
	//Name: myStringBuilder(int capacityInput)
	//Description: default constructor with capacity input
	//-------------------------------------------------------------
	public myStringBuilder(int capacityInput) {
		myString = new char [capacityInput];
		capacity = capacityInput;
	}
	
	
	//-------------------------------------------------------------	
	//Name: myStringBuilder(String userInput)
	//Description: default constructor that takes a String as input
	//-------------------------------------------------------------
	public myStringBuilder(String userInput) {
		myString = new char [userInput.length()];
		capacity = 0;
		size = userInput.length();
		myString = userInput.toCharArray();
		
	}

	
	//-------------------------------------------------------------	
	//Name: setCharAt()
	//Description: setting a character at a specific index
	//-------------------------------------------------------------
	public String setCharAt(int index, char letter) {
		//check index
		if ((index >= myString.length) || (index < 0)) {
			throw new ArrayIndexOutOfBoundsException();
		}
		myString[index] = letter;
		
		return String.valueOf(myString);
	}
	
	
	//-------------------------------------------------------------	
	//Name: resize()
	//Description: resizing the character array
	//-------------------------------------------------------------
	private void resize(int spaceNeeded) {
		
		System.out.println("capacity: " + capacity);
		if (spaceNeeded >= capacity) {
			int tempCapacity = (size + capacity + 1) * 2;
			
			char [] temp = new char [tempCapacity];
			capacity = tempCapacity - size;
			temp = copyOldToNew(temp);
			myString = temp;	
		}
		System.out.println("resize: end of method");
		
	}
	
	
	//-------------------------------------------------------------	
	//Name: deleteResize()
	//Description: resizing the character array
	//-------------------------------------------------------------
	private void deleteResize(int sizeOfArray) {
		
		//System.out.println("capacity: " + capacity);
		int tempCapacity = (sizeOfArray + 1);
			
		char [] temp = new char [tempCapacity];
		capacity = tempCapacity - sizeOfArray;
		temp = createNew(temp, sizeOfArray);
		myString = temp;	
		
		size = myString.length;
		
		//System.out.println("resize: end of method");
		
	}
	
	//-------------------------------------------------------------	
	//Name: copyOldToNew
	//Description: copying contents of the old char array to the 
	// new resized char array
	//-------------------------------------------------------------
	private char [] createNew(char [] temp, int sizeOfArray) {
		
		//System.out.println("copyOldToNew length of string: " + myString.length);
		for(int i = 0; i < sizeOfArray; i++) {
			
			temp[i] = myString[i];
		}
		
		return temp;
	}
		
	
	//-------------------------------------------------------------	
	//Name: copyOldToNew
	//Description: copying contents of the old char array to the 
	// new resized char array
	//-------------------------------------------------------------
	private char [] copyOldToNew(char [] temp) {
		
		System.out.println("copyOldToNew length of string: " + myString.length);
		for(int i = 0; i < myString.length; i++) {
			
			temp[i] = myString[i];
		}
		
		return temp;
	}
	
	
	
	//-------------------------------------------------------------	
	//Name: deleteCharAt()
	//Description: delete a char at a specific index
	//-------------------------------------------------------------
	public String deleteCharAt(int index) {
		
		//check boundaries
		if((index < 0) || (index > myString.length)) {
			throw new ArrayIndexOutOfBoundsException();
		}
		
		int i =0;
		System.out.println("size " + size);
		
		System.out.println("index = " + index);
		for(i = index; i < size - 1; i++) {
		
			myString[i] = myString[i + 1];
			System.out.println(myString[i]);
			
		}
		myString[i] = ' ';
		capacity ++;
		size --;
		
		return String.valueOf(myString);
	}
	
	
	//-------------------------------------------------------------	
	//Name: delete(int startIndex, int endIndex)
	//Description: delete characters between startIndex and endIndex
	//-------------------------------------------------------------
	public String delete(int startIndex, int endIndex) throws Exception {
		
		//check boundaries
		if ((startIndex < 0) || (startIndex >= myString.length - 1) || (endIndex < 0) || (endIndex >= myString.length - 1)) {
			throw new ArrayIndexOutOfBoundsException();
		}
		if (endIndex < startIndex) {
			throw new Exception("endIndex can not be less than start Index");
		}
		
		int difference = endIndex - startIndex + 1;	
		
		int i = startIndex;
		while(i + difference < myString.length) {
			
			myString[i] = myString[i+difference];
			
			i++;
			capacity ++;
			size--;
		}	
		
		deleteResize(difference);
		
		return String.valueOf(myString);
		
	}
	
	
	//-------------------------------------------------------------	
	//Name: append(String str)
	//Description: append a string to the end of the char array
	//-------------------------------------------------------------
	public String append(String str) {
		
		resize(str.length());
		
		int i = size;
		int counter = 0;
		while (counter < str.length()) {
			myString[i] = str.charAt(counter);
			size ++;
			capacity --;
			counter ++;
			i++;
		}
		
		return String.valueOf(myString);
		
	}
	
	
	//-------------------------------------------------------------	
	//Name: append(char [] letters)
	//Description: append a char [] to the end of the char array
	//-------------------------------------------------------------
	public String append(char [] letters) {
		
		int sizeOfLetters = letters.length;
		
		resize(sizeOfLetters);
		
		int count = 0;
		int i = size;
		while(i < sizeOfLetters) {
			myString[i] = letters[count];
			i++;
			count++;
			size++;
			capacity --;
			
		}		
		
		return String.valueOf(myString);
	}
	

	
	//-------------------------------------------------------------	
	//Name: getCapacity()
	//Description: get the capacity of the char array
	//-------------------------------------------------------------
	public int getCapacity() {
		return capacity;
	}
	
	//-------------------------------------------------------------	
	//Name: getSize()
	//Description: get the size of the char array
	//-------------------------------------------------------------
	public int getSize() {
		return size;
	}
	
	
}

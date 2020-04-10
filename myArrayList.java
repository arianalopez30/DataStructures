package arrayLists;

public class myArrayList {

	private Object [] arrayList;
	private int DEFAULT_SIZE = 10;
	private int size = 0;
	
	//Constructors
	
	//-------------------------------------------------------------	
	//Name: myArrayList()
	//Description: default constructor that uses default values
	//-------------------------------------------------------------

	public myArrayList() {
		
		arrayList = new Object[DEFAULT_SIZE];
		
	}
	
	//-------------------------------------------------------------	
	//Name: myArrayList(int size)
	//Description: constructor that allows size to be passed in
	//-------------------------------------------------------------
	public myArrayList(int size) {
		
		arrayList = new Object[size];
		
	}
	
	
	//-------------------------------------------------------------	
	//Name: clear
	//Description: clears the arrayList contents to null and zeros
	//the size out
	//-------------------------------------------------------------
	public void clear() {
		
		for(int i = 0; i < arrayList.length; i++) {
			
			arrayList[i] = null;
			
		}
		
		size = 0;
		
	}
	
	//-------------------------------------------------------------	
	//Name: isEmpty
	//Description: Check to see if the arrayList is empty, returns
	//a boolean
	//-------------------------------------------------------------
	public boolean isEmpty() {
		
		boolean isEmpty = false;
		
		if(size == 0)
		{
			isEmpty = true;
		}
		
		return isEmpty;
			
	}
	
	
	//-------------------------------------------------------------	
	//Name: indexOf
	//Description: returns the index of where an object is found
	//-------------------------------------------------------------
	public int indexOf(Object obj) {
		
		for(int i = 0; i < arrayList.length; i++)
		{
			if (arrayList[i] == obj) {
				return i;
			}
		}
		
		//not found in arrayList
		return -1;
		
	}
	
	
	//-------------------------------------------------------------	
	//Name: get
	//Description: gets the object at a particular index
	//-------------------------------------------------------------
	public Object get(int index) {
		
		//check boundary
		if(index >= arrayList.length || index < 0 )
		{
			throw new ArrayIndexOutOfBoundsException();
		}
		
		return arrayList[index];
		
	}
	
	
	//-------------------------------------------------------------	
	//Name: add(Object obj)
	//Description: Adds an object at the end of the arrayList
	//-------------------------------------------------------------
	public void add(Object obj) {
		
		int index = 0;
		
		//do i need to resize
		resize();
		
		while(arrayList[index] != null)
		{
			index ++;
			
		}
		arrayList[index] = obj;
		size ++;
		
	}
	
	
	//-------------------------------------------------------------	
	//Name: resize
	//Description: checks the size of the arraylist and will increase
	//it, if necessary
	//-------------------------------------------------------------
	private void resize(){
		
		Object [] temp;
		
		if(size + 1 >= arrayList.length)
		{
			temp = new Object[arrayList.length * 2];
			temp = copyArrayList(temp);
			arrayList = temp;	
		}
		
		
	}
	
	//-------------------------------------------------------------	
	//Name: copyArrayList
	//Description: copies the original contents of the array into 
	//a new arrayList
	//-------------------------------------------------------------
	private Object [] copyArrayList(Object [] newList)
	{
		for(int i = 0; i < arrayList.length; i++) {
			
			newList[i] = arrayList[i];
		}
		
		return newList;
	}
	
	
	//-------------------------------------------------------------	
	//Name: add(int index, Object obj)
	//Description: adds an object at a particular index
	//-------------------------------------------------------------
	public void add(int index, Object obj) {
		
		//check the boundary
		//check boundary
		if(index >= arrayList.length || index < 0 )
		{
			throw new ArrayIndexOutOfBoundsException();
		}
		
		resize();
		
		int i = arrayList.length - 1;
		
		while(i != index) {
			
			arrayList[i] = arrayList[i-1];
			i--;			
			
		}
		
		arrayList[i] = obj;
		size ++;
		
	}
	
	
	//-------------------------------------------------------------	
	//Name: remove(int index)
	//Description: removes object at a particular index
	//-------------------------------------------------------------
	public void remove(int index) {
		
		//check boundary
		if(index >= arrayList.length || index < 0 )
		{
			throw new ArrayIndexOutOfBoundsException();
		}
		
		for(int i = index; i < arrayList.length - 1; i++) {
			
			arrayList[i] = arrayList[i+1];
			
		}

		arrayList[arrayList.length - 1] = null;
		size --;
		
	}
	
	//-------------------------------------------------------------	
	//Name: remove(Object obj)
	//Description: removes object at a particular index
	//-------------------------------------------------------------
	public void remove(Object obj) {
		
		int index = indexOf(obj);
		
		if(index != -1)
		{
			remove(index);
			
		}
		
	}
	
	
	//-------------------------------------------------------------	
	//Name: getSize()
	//Description: returns the size
	//-------------------------------------------------------------
	public int getSize() {
		
		return size;
		
	}
	
	
	
	
	

}

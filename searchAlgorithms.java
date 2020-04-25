
public class main {

	public static void main(String[] args) {
		int [] list = {2, 5, 8, 15, 20, 33, 45, 80, 98};
		int index = linearSearch(list, 7);
		
		System.out.println("Was the key found: " + index);
		
		int indexBinarySearch = binarySearch(list, 3);
		System.out.println("Was the key found: " + indexBinarySearch);

	}
	
	//------------------------------------------------------
	//Name: linearSearch
	//Description: does a linear search by looking at all
	//elements in the array. Worst case O(n) = O(n)
	//------------------------------------------------------
	public static int linearSearch(int [] list, int key) {
		
		int indexFound = -1;
		
		//array must be sorted in ascending order
		java.util.Arrays.sort(list);
		for(int i = 0; i < list.length; i++) {
			
			if(list[i] == key) {
				return i;
			}
		}
		
		return indexFound;
	}
	
	
	//------------------------------------------------------
	//Name: binarySearch
	//Description: does a linear search by halfing the sorted
	//array. Worst case O(n) = log (n + 1)
	//------------------------------------------------------
	public static int binarySearch(int [] list, int key) {
		
		//make sure array is sorted
		java.util.Arrays.sort(list);
		
		int low = 0;
		int high = list.length - 1;
		
		while(high >= low )
		{
			int middle = (high + low) / 2;
			
			if(key < list[middle]) {
				high = middle - 1;
			}
			else if(key == list[middle]) {
				return middle;
			}
			else {
				low = middle + 1;
			}
		
		}
		
		return -low - 1;
	}

}

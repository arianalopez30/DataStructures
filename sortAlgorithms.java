
public class SortAlgorithms {

	public static void main(String[] args) {

		int [] list = {34, 56, 0, 22, 3};
		
		//selectionSort(list);
		
		
		insertionSort(list);
		for(int i = 0; i < list.length; i++)
			System.out.println(list[i]);


	}
	
	
	//------------------------------------------------------
	//Name: selectionSort
	//Description: sorts by finding the largest value and 
	//swapping that with the last element of the array
	//------------------------------------------------------
	public static void selectionSort(int [] list) {
		
		//find the max value
		for(int i = list.length - 1; i > 0; i--) {
			
			int maxValue = list[0];
			int maxIndex = 0;
			
			for(int x = 1; x <= i; x++) {
				if(list[x] > maxValue) {
					maxValue = list[x];
					maxIndex = x;
				}
			}
			
			if(maxIndex != i) {
				list[maxIndex] = list[i];
				list[i] = maxValue;
				
			}
			
		}
		
	}
	
	//------------------------------------------------------
	//Name: insertionSort
	//Description: sorts by creating the sorted array as it builds
	//------------------------------------------------------
	public static void insertionSort(int [] list) {
		
		for(int i = 1; i < list.length; i++) {
			int currentElement = list[i];
			
			int k;
			
			for(k = i - 1; k >=0 && list[k] > currentElement; k--) {
				
				list[k+1] = list[k];
				
			}
			
			list[k+1] = currentElement;
			
			
		}
		
	}

}

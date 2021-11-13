package activities;

import java.util.Arrays;

public class Activity4 {

	public static void main(String[] args) {
		
		// Initializing array
		
		int [] exampleArray = {3,2,1,5,6,9,8};
		
		System.out.println("Array before sorting :"+Arrays.toString(exampleArray));
		
		ascendingSort(exampleArray);
		
		System.out.println("Array after sorting :"+Arrays.toString(exampleArray));

	}
	
	static void ascendingSort(int array[]) {
	int size = array.length, i;
	        
	for (i = 1; i < size; i++) {
	     int key = array[i];
	     int j = i - 1;
	     
	     while (j >= 0 && key < array[j]) {
	          array[j + 1] = array[j];
	          --j;
	            }
	            array[j + 1] = key;
	        }
	    }
	    
	    
}

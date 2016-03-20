package Sorting;
public class BubbleSort {
	/**
	 * bubbleSort				sorts an array of integers using bubble sort
	 * 
	 * @param unsortedArray		an unsorted array of integers
	 * @return					the input array, sorted least to greatest
	 */
	public static int[] bubbleSort(int[] unsortedArray) {
		//TODO: S1 implements bubble sort
		if(unsortedArray == null) {
			return unsortedArray;
		}
		
		int size = unsortedArray.length;
		if(size <= 1) {
			return unsortedArray;
		}
		
		int tmp;
		boolean sorted = false;
		while(sorted == false) {
			sorted = true;
			for(int i = 1; i < size; i++) {
				if(unsortedArray[i] < unsortedArray[i-1]) {
					sorted = false;
					tmp = unsortedArray[i];
					unsortedArray[i] = unsortedArray[i-1];
					unsortedArray[i-1] = tmp;
				}
			}
			size--;
		}
	    return unsortedArray;
	}
}

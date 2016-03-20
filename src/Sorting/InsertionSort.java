package Sorting;

public class InsertionSort {
	/**
	 * insertionSort			sorts an array of integers using insertion sort
	 * 
	 * @param unsortedArray		an unsorted array of integers
	 * @return					the input array, sorted least to greatest
	 */
	public static int[] insertionSort(int[] unsortedArray) {
		nt n = unsortedArray.length;
	  if (n == 0 || n == 1) {
		  return unsortedArray;
	  }
	  int i;
	  int j;
	  int tmp;
	  for (i = 1; i < n; i++) {
		  tmp = unsortedArray[i];
		  for (j = i - 1; (j >= 0) && unsortedArray[j] > tmp; j--) {
			  unsortedArray[j + 1] = unsortedArray[j];
		  }
		  unsortedArray[j + 1] = tmp;
	  }
    return unsortedArray;
	}
}

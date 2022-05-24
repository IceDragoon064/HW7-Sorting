/**
 * This class simulates quick sort
 * @author Leon Lu
 * @version May 23, 2022
 */
public class BasicTraining 
{
	private int leftStartIndex, leftTailIndex, rightStartIndex, rightTailIndex;
	
	/**
	 * Sort the array using quick sort, this must be:
	 * 
	 * in-place (no temporary arrays)
	 * O(n log n)
	 * 
	 * @param array - the unsorted array
	 * @return a sorted array - the sorted array
	 */
	public static <T extends Comparable<? super T>> T[] quickSort(T[] array) 
	{
		// Get the first and last indexes of the array
		int startIndex = 0;
		int lastIndex = array.length - 1;

		// Call the sorting method with the starting and last indexes
		sortArray(array, startIndex, lastIndex);
		return array;
	}
	
	
	/**
	 * Split the array into smaller portion and sort the values
	 * @param array - the array to be sorted
	 * @param startIndex - the starting index of the array to be sorted
	 * @param lastIndex - the last index of the array to be sorted
	 * @return pivotIndex - the index of the pivot element in the array
	 */
	private static <T extends Comparable<? super T>> int partition(T[] array, int startIndex, int lastIndex)
	{
		// Make the middle element as the pivot
		int pivotIndex = (startIndex + lastIndex) / 2;
		T pivotValue = array[pivotIndex];

		while(true)
		{
			//Compare values of the left half of the split array
			while(array[startIndex].compareTo(pivotValue) < 0)
			{
				startIndex++;
			}
			
			// Compare values of the right half of the split array
			while(array[lastIndex].compareTo(pivotValue) > 0)
			{
				lastIndex--;
			}
			
			if(startIndex >= lastIndex)
			{
				return lastIndex;
			}
			
			// Change the elements on startIndex and lastIndex
			T temp = array[startIndex];
			array[startIndex] = array[lastIndex];
			array[lastIndex] = temp;
		}
	}
	
	/**
	 * The sorting method
	 * @param <T> - the typescript element
	 * @param array - the array to be sorted
	 * @param startIndex - the starting index of the sort process
	 * @param lastIndex - the rightmost index of the sort process
	 */
	private static <T extends Comparable<? super T>>  void sortArray(T[] array, int startIndex, int lastIndex)
	{
		if(startIndex < lastIndex)
		{
			int pivotIndex = partition(array, startIndex, lastIndex);
			
			sortArray(array, startIndex, pivotIndex);		// Sort the left half of the array
			sortArray(array, pivotIndex + 1, lastIndex);	// Sort the right half of the array
		}
	}
}
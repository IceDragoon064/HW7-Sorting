package Submission;
/**
 * This java class file will sort an array using in-place method
 * @author Leon Lu
 * @version May 23, 2022
 */
public class MissionOne {

	/**
	 * Sort the array using an in-place sort, this algorithm must be:
	 * 
	 * in-place (no temporary arrays)
	 * stable
	 * O(n^2)
	 * 
	 * @param array - the unsorted array
	 * @return array - the sorted array 
	 */
	public static <T extends Comparable<? super T>> T[] inplaceSort(T[] array) 
	{
		Boolean isSorted = false;	// Boolean variable for while loop parameter
		int sortCheck = 0;			// Check if a pair of element is sorted. Increment if the pair is sorted
		while(!isSorted)
		{
			for (int i = 0; i < array.length; i++)
			{
				if(i == array.length - 1)
				{
					// Do nothing since i will be the last index
				}
				else
				{
					T tempValue1 = array[i];		// Get the current index value
					T tempValue2 = array[i + 1];	// Get the next index value
					
					// Check if tempValue1 is greater than tempValue2
					// If tempValue1 is greater, swap values
					if(tempValue1.compareTo(tempValue2) > 0)
					{
						array[i] = tempValue2;
						array[i+1] = tempValue1;
					}
					else
					{
						sortCheck++;
					}
				}
			}
			
			// All elements are sorted
			if(sortCheck == array.length - 1)
			{
				break;
			}
			
			// Array is not sorted. Reset the sortCheck value to 0
			else
			{
				sortCheck = 0;
			}
		}
		return array;
	}
}

	
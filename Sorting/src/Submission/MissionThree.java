package Submission;
import java.util.Arrays;

/**
 * Mission Three is to merge two sorted arrays and calculate the difference in their values
 * @author Leon Lu
 * @version May 24, 2022
 */
public class MissionThree 
{
	/**
	 * Merges two sorted arrays, and computer the difference in scores
	 * 
	 * @param person1 a sorted array of medals
	 * @param person2 a sorted array of medals
	 * @return the difference in score of person1 and person2
	 */
	public static <T extends Comparable<? super T>> int merge(T[] person1, T[] person2) 
	{
		// Track the score for each person's medal based on index location
		int person1Score = 0;
		int person2Score = 0;
		
		// Get the size of each person's array
		int person1Size = person1.length;
		int person2Size = person2.length;
		
		// The merged array will have the size equal to the sum of person1 and person2 sizes
		int mergedArraySize = person1Size + person2Size;
		T[] mergedArray = (T[]) new Comparable[mergedArraySize];
		
		
		int p1Index = 0;
		int p2Index = 0;
		int mArrayIndex = 0;
		
		/**
		 * While loop to iterate through both arrays
		 * Compare each element of the same index from both arrays
		 */
		while(p1Index  < person1Size &&p2Index < person2Size)
		{
			// If person1's element is less than person2's element, add person1's element to merged array
			if(person1[p1Index].compareTo(person2[p2Index]) < 0)
			{
				mergedArray[mArrayIndex] = person1[p1Index];
				person1Score += (mArrayIndex + 1);
				System.out.println("Added " + person1[p1Index] + " to merged array at index: " + mArrayIndex);
				p1Index++;
				
			}
			
			// If person2's element is less than person1's element, add person2's element to merged array
			else
			{
				mergedArray[mArrayIndex] = person2[p2Index];
				person2Score += (mArrayIndex + 1);
				System.out.println("Added " + person2[p2Index] + " to merged array at index: " + mArrayIndex);
				p2Index++;
				
			}
			
			// Move to the next index in the merged array
			System.out.println("Person 1 Score: " + person1Score);
			System.out.println("Person 2 Score: " + person2Score);
			mArrayIndex++;
		}
		
		/**
		 * The following while loops are used to add elements if any of the two arrays have reached the end
		 * First while loop: Add remaining elements from person1 to merged array
		 * Second while loop: add remaining elements from person2 to merged array
		 */
		while(p1Index < person1Size)
		{
			mergedArray[mArrayIndex] = person1[p1Index];
			person1Score += (mArrayIndex + 1);
			System.out.println("Added " + person1[p1Index] + " to merged array at index: " + mArrayIndex);
			System.out.println("Person 1 Score: " + person1Score);
			p1Index++;
			mArrayIndex++;
			
		}

		while(p2Index < person2Size)
		{
			mergedArray[mArrayIndex] = person2[p2Index];
			person2Score += (mArrayIndex + 1);
			System.out.println("Added " + person2[p2Index] + " to merged array at index: " + mArrayIndex);
			System.out.println("Person 2 Score: " + person2Score);
			p2Index++;
			mArrayIndex++;

		}
		System.out.println(Arrays.toString(mergedArray));
		System.out.println("Final Person 1 Score: " + person1Score);
		System.out.println("Final Person 2 Score: " + person2Score);
		
		
		// Get the difference of person1 and person2 and return it
		int finalScore = Math.abs(person1Score - person2Score);
		return finalScore;
	}
	
	
	
	
}
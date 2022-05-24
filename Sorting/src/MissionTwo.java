public class MissionTwo<T extends Comparable<? super T>> 
{

	private T[] data;
	private int itemSize = 0;
	/**
	 * Default Constructor
	 */
	public MissionTwo(int maxCapacity) 
	{
		// TODO Constructor
		this.data = (T[]) new Comparable[maxCapacity];
	}
	
	/**
	 * Adds the item to the structure, must be
	 * 
	 * in-place
	 * stable
	 * O(n)
	 * 
	 * @param item
	 */
	public void add(T item) 
	{
		// TODO Method
		
		// Check if the array is full. 
		if(itemSize == this.data.length - 1)
		{
			throw new IndexOutOfBoundsException("The array is full: Cannot add item.");
		}
		
		else
		{
			// If there is no item in array, add element without sorting
			if(itemSize == 0)
			{
				this.data[0] = item;
				itemSize++;
			}
			
			// Sort the array after adding a new element
			else 
			{
				// For loop to find an empty index
				for(int i = 0; i < data.length; i++)
				{
					if(this.data[i] == null)
					{
						this.data[i] = item;
						itemSize++;
						break;
					}
				}

				/**
				 * Sort the array by starting on index #1
				 */
				for (int i = 1; i < data.length; i++)
				{
					int currentIndex = i;
					
					// Stop the sort if the element on the current index is null
					if(data[currentIndex] == null)
					{
						break;
					}
					
					/**
					 * Compare the current element with previous element 
					 * If previous element is greater than current element, swap their places
					 */
					while (currentIndex > 0 && data[currentIndex - 1].compareTo(data[currentIndex]) > 0)
					{
						T tempValue = data[currentIndex];
						data[currentIndex] = data[currentIndex - 1];
						data[currentIndex - 1] = tempValue;
						currentIndex--;
					}
				}
			}		
		}
	}
	
	/**
	 * This must return the smallest element in this structure, must be
	 * 
	 * in-place
	 * stable
	 * O(1)
	 * 
	 * @return the smallest element currently in this structure
	 */
	public T remove() 
	{
		// Get the smallest element of the array
		T smallestValue = this.data[0];
		
		/**
		 * "Remove" the smallest element by shifting all elements toward the left
		 */
		for(int i = 0; i < this.data.length; i++)
		{
			if(this.data[i] != null)
			{
				this.data[i] = this.data[i + 1];
			}
		}
		return smallestValue;
	}
}
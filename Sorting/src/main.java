import java.util.Arrays;

public class main
{
		public static void main(String[] args)
		{
			BasicTraining testSort = new BasicTraining();
			
			String[] arrayOfString = { "Obi-Wan:", "Hello", "There", "Grevious:", "General", "Kenobi", "You", "Are", "Bold","One" };
			
			System.out.println("String Array before sorting: " + Arrays.deepToString(arrayOfString));
			arrayOfString = testSort.quickSort(arrayOfString);
			System.out.println("String Array after sorting: " + Arrays.deepToString(arrayOfString));

			
			Integer[] arrayOfInt = { 1, 35, -51, 8, -6, 24, 2, 75, -101, 44};
			
			System.out.println("Integer Array before sorting: " + Arrays.deepToString(arrayOfInt));
			arrayOfInt = testSort.quickSort(arrayOfInt);
			System.out.println("Integer Array after sorting: " + Arrays.deepToString(arrayOfInt));
			
		}
	}

import java.util.Arrays;


/**
 * This main class file is used to test the sort methods
 * @author Leon Lu
 * @version May 23, 2022
 */
public class main
{
		public static void main(String[] args)
		{
			//TestQuickSort();
			//TestInSort();
			TestAddSort();
			
			
			
		}
		
		/**
		 * Method to test quick sort using string and integer arrays 
		 * Tests BasicTraining.java
		 */
		public static void TestQuickSort()
		{
			System.out.println("======================================================");
			
			BasicTraining testQuickSort = new BasicTraining();
			
			String[] arrayOfString = { "Obi-Wan:", "Hello", "There", "Grevious:", "General", "Kenobi", "You", "Are", "Bold","One" };
			System.out.println("String Array before quick sorting: " + Arrays.deepToString(arrayOfString));
			arrayOfString = testQuickSort.quickSort(arrayOfString);
			System.out.println("String Array after quick sorting: " + Arrays.deepToString(arrayOfString));

			
			Integer[] arrayOfInt = { 1, 35, -51, 8, -6, 24, 2, 75, -101, 44};
			System.out.println("Integer Array before quick sorting: " + Arrays.deepToString(arrayOfInt));
			arrayOfInt = testQuickSort.quickSort(arrayOfInt);
			System.out.println("Integer Array after quick sorting: " + Arrays.deepToString(arrayOfInt));
			
			System.out.println("======================================================" + "\n");
		}
		
		/**
		 * Method to test in-place sort using string and integer arrays
		 * Tests MissionOne.java
		 */
		public static void TestInSort()
		{
			System.out.println("======================================================");
			MissionOne testInSort = new MissionOne();
			
			String[] arrayOfString2 = { "I", "Hate", "Sand", "It's", "Coarse", "And", "Rough" };
			System.out.println("String Array before in-place sorting: " + Arrays.deepToString(arrayOfString2));
			arrayOfString2 = testInSort.inplaceSort(arrayOfString2);
			System.out.println("String Array after in-place sorting: " + Arrays.deepToString(arrayOfString2));
			
			
			Integer[] arrayOfInt2 = { 64, 12, 334, -13, 75, 01, 87, 9};
			System.out.println("Integer Array before in-place sorting: " + Arrays.deepToString(arrayOfInt2));
			arrayOfInt2 = testInSort.inplaceSort(arrayOfInt2);
			System.out.println("Integer Array after in-place sorting: " + Arrays.deepToString(arrayOfInt2));
			
			
			System.out.println("======================================================" + "\n");
		}
		
		public static void TestAddSort()
		{
			System.out.println("======================================================");
			MissionTwo testAddSort = new MissionTwo(10);
			
			testAddSort.add("Sniper Bot");
			testAddSort.add("Rocket Bot #1");
			testAddSort.add("Alpha-Heavy Bot #1");
			testAddSort.add("Heavy Bot #1");
			testAddSort.add("Rocket Bot #2");
			testAddSort.add("Heavy Bot #3");
			testAddSort.add("Assault Walker #1");
			testAddSort.add("Assault Walker #2");
			testAddSort.add("Assault Walker #3");

			System.out.println("Target destroyed: " + testAddSort.remove());
			
			System.out.println("======================================================" + "\n");
		}
	}

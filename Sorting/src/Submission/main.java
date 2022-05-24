package Submission;
import java.util.Arrays;

/**
 * This main class file is used to test the sort methods
 * @author Leon Lu
 * @version May 24, 2022
 */
public class main
{
		public static void main(String[] args)
		{
			TestQuickSort();
			TestInSort();
			TestAddSort();
			TestMerge();
			TestImpossible();
		}
		
		/**
		 * Method to test quick sort using string and integer arrays in BasicTraining.java
		 */
		public static void TestQuickSort()
		{
			System.out.println("======================================================");
			System.out.println("Quick Sort");
			BasicTraining testQuickSort = new BasicTraining();
			
			String[] arrayOfString = { "Obi-Wan:", "Hello", "There", "Grevious:", "General", "Kenobi", "You", "Are", "Bold","One" };
			System.out.println("String Array before quick sorting: " + Arrays.deepToString(arrayOfString));
			arrayOfString = testQuickSort.quickSort(arrayOfString);
			System.out.println("String Array after quick sorting: " + Arrays.deepToString(arrayOfString) + "\n");

			
			Integer[] arrayOfInt = { 1, 35, -51, 8, -6, 24, 2, 75, -101, 44};
			System.out.println("Integer Array before quick sorting: " + Arrays.deepToString(arrayOfInt));
			arrayOfInt = testQuickSort.quickSort(arrayOfInt);
			System.out.println("Integer Array after quick sorting: " + Arrays.deepToString(arrayOfInt));
			
			System.out.println("======================================================" + "\n");
		}
		
		/**
		 * Method to test in-place sort using string and integer arrays in MissionOne.java
		 */
		public static void TestInSort()
		{
			System.out.println("======================================================");
			System.out.println("In-Place Sort");
			MissionOne testInSort = new MissionOne();
			
			String[] arrayOfString2 = { "I", "Hate", "Sand", "It's", "Coarse", "And", "Rough" };
			System.out.println("String Array before in-place sorting: " + Arrays.deepToString(arrayOfString2));
			arrayOfString2 = testInSort.inplaceSort(arrayOfString2);
			System.out.println("String Array after in-place sorting: " + Arrays.deepToString(arrayOfString2) + "\n");
			
			
			Integer[] arrayOfInt2 = { 64, 12, 334, -13, 75, 01, 87, 9};
			System.out.println("Integer Array before in-place sorting: " + Arrays.deepToString(arrayOfInt2));
			arrayOfInt2 = testInSort.inplaceSort(arrayOfInt2);
			System.out.println("Integer Array after in-place sorting: " + Arrays.deepToString(arrayOfInt2));
			
			
			System.out.println("======================================================" + "\n");
		}
		
		/**
		 * Method to test in-place sort in addition to adding elements and removing elements in MissionTwo.java
		 */
		public static void TestAddSort()
		{
			System.out.println("======================================================");
			System.out.println("In-Place Sort with add and remove");
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
		
		/**
		 * Method to test merge sort in MissionThree.java
		 */
		public static void TestMerge()
		{
			System.out.println("======================================================");
			System.out.println("Merge Sort");
			MissionThree testMergeSort = new MissionThree();
			Integer[] p1Medal = {1, 5, 7};
			Integer[] p2Medal = {2, 3, 4, 6};
			System.out.println("The difference between two people is: " + testMergeSort.merge(p1Medal, p2Medal) + "\n");
			
			System.out.println("======================================================" + "\n");
			
		}
		
		/**
		 * Method to find the maximum number of soldiers to droop in MissionImpossible.java
		 */
		public static void TestImpossible()
		{
			System.out.println("======================================================");
			System.out.println("Mission Impossible");
			MissionImpossible testTheImpossible = new MissionImpossible();
			MissionImpossible.LaserTower[] towerGrid = new MissionImpossible.LaserTower[7]; 
			towerGrid[0] = new MissionImpossible.LaserTower(7,1);
			towerGrid[1] = new MissionImpossible.LaserTower(1,2); 
			towerGrid[2] = new MissionImpossible.LaserTower(4,3);
			towerGrid[3] = new MissionImpossible.LaserTower(6,4);
			towerGrid[4] = new MissionImpossible.LaserTower(3,5); 
			towerGrid[5] = new MissionImpossible.LaserTower(5,6);
			towerGrid[6] = new MissionImpossible.LaserTower(2,7);
			System.out.println("The maximum number of troops that can enter the field is: " + testTheImpossible.maxTroops(towerGrid));
			
			System.out.println("======================================================" + "\n");
		}
	}

package Submission;
import java.util.Arrays;

/**
 * Mission Impossible will create a 2D array of the area based on laser towers coordinates
 * And find the largest rectangle that is safe
 * @author Leon Lu
 * @version May 24, 2022
 */
public class MissionImpossible 
{
	/**
	 * You are given a list of laser towers the block of columns and rows.
	 * 
	 * Find the area of the largest contiguous rectangle that no laser
	 * intersects.
	 * 
	 * You can assume that no two towers lie in the same column or row.
	 * 
	 * @param 	towers - the LaserTower array containing the coordinates for the towers
	 * @return 	maxTrop - the maximum number of troops that can fit in a contiguous 
	 * 						rectangle not able to be hit by a laser tower
	 */
	public static int maxTroops(LaserTower[] towers) 
	{
		int maxX = 0;
		int maxY = 0;
		
		// Find the maximum X and Y coordinates from the given towers
		for(int i = 0; i < towers.length; i++)
		{
			int tempX = towers[i].getX();
			int tempY = towers[i].getY();
			
			// Assign new maximum X and Y value from the array if the temp X and Y values are greater than the current X and Y values
			if(tempX > maxX)
			{
				maxX = tempX;
			}
			
			if(tempY > maxY)
			{
				maxY = tempY;
			}
		}
		
		// Use the X and Y coordinates to create a 2D array
		int[][] battlefieldGrid = new int[maxX][maxY];
		
		/**
		 * For this array, 0, 1, be used
		 * 0 indicates the tower or tower's firign range
		 * 1 indicates the only area that the troops can land
		 * Example:
		 * 1 0 1
		 * 0 0 0
		 * 1 0 1
		 */
		
		//First, set all values in grid to 1
		for(int y = 0; y < maxY; y++)
		{
			for (int x = 0; x < maxX; x++)
			{
				battlefieldGrid[x][y] = 1;
			}
		}
		
		
		//Next, set all nonsafe areas to 0s
		for(int i = 0; i < towers.length; i++)
			{
				// Get the tower's coordinates in index 
				int towerX = towers[i].getX() - 1;
				int towerY = towers[i].getY() - 1;
				
				// Assign 0 to the tower's location
				battlefieldGrid[towerX][towerY] = 0;
				
				/**
				 * Find the adjacent squares of the towers and assign them as 1
				 * Also check if these adjacent squares are within the array
				 */
				// North
				int northY = towerY - 1;
				if(northY >= 0 && battlefieldGrid[towerX][northY] == 1)
				{
					battlefieldGrid[towerX][northY] = 0;
				}
				
				// East
				int eastX = towers[i].getX();
				if(eastX < maxX && battlefieldGrid[eastX][towerY] == 1)
				{
					battlefieldGrid[eastX][towerY] = 0;
				}
				
				// South
				int southY = towers[i].getY();
				if(southY < maxY && battlefieldGrid[towerX][southY] == 1)
				{
					battlefieldGrid[towerX][southY] = 0;
				}
				
				// West
				int westX = towerX - 1;
				if(westX >= 0 && battlefieldGrid[westX][towerY] == 1)
				{
					battlefieldGrid[westX][towerY] = 0;
				}
			}
		
		int[][] copyGrid = battlefieldGrid;
			

		// Print out the battlefieldGrid
		for (int y = 0; y < battlefieldGrid.length; y++)
			{
			 	for(int x = 0; x < battlefieldGrid.length; x++)
			 	{
			 		System.out.print(battlefieldGrid[x][y]+ " ");
			 	}
			 	System.out.println();
			} 
		
		// Finally, get the maximum number of troops to land in field
		int maxTroop = FindMaxArea(battlefieldGrid, copyGrid);
		return maxTroop;
	}
	
	
	/**
	 * The tower coordinate class that will assume x and y do not follow the index convention (i.e. tower (1,1) will be the northeastern most tower)
	 * @author Leon Lu
	 */
	public static class LaserTower 
	{
		public int x;
		public int y;
		
		public LaserTower(int x, int y) 
		{
			this.x = x;
			this.y = y;
		}
		
		private int getX()
		{
			return this.x;
		}
		
		private int getY()
		{
			return this.y;
		}
	}
	
	
	/**
	 * Find the largest rectangle area that will be safe for the troops and return the number of troops
	 * Each troop equates to one element in the 2D array
	 * Area of a rectangle = Length x Width
	 * @return area - the area of the largest rectangle found in the grid
	 */
	public static int FindMaxArea(int[][] grid, int[][] copyGrid)
	{
		int maxArea = 0;
		
		// Create matrix size x and y based on the original grid
		int matrixX = grid.length;
		int matrixY = grid[0].length;
		
		// Count the number of consecutive 1 in the matrix
		for (int j = 0; j < matrixY; j++)
		{
			// Search through the column
			for(int i = matrixX - 2; i >= 0; i--)
			{
				if(grid[i][j] == 1)
				{
					grid[i][j] = grid[i+1][j] + 1;
				}
			}
		}
		
		// Search through each row of the matrix
		for(int i = 0; i < matrixX; i++)
		{
			int[] count = new int[matrixX + 1];
			
			for (int j = 0; j < matrixY; j++)
			{
				if(grid[i][j] > 0)
				{
					count[grid[i][j]] += 1;
					
					// Calculate the area with the current element and count element
					maxArea = Integer.max(maxArea, grid[i][j] * count[grid[i][j]]);
				}
			}
		}
		
		// Reset the battlefield grid
		grid = copyGrid;
		return maxArea;
		
	}
}
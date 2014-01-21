package array.view;

public class ArrayView
{
/**
 * Establishes the int array for the familyAges information. 
 * @param currentArray 
 */
	public void printIntInformation(int [][] currentArray)
	{
		System.out.println("foreach printing");
		for(int [] currentRow: currentArray)
		{
			for(int currentNumber : currentRow)
			{
				System.out.print(currentNumber + "\t");
			}
			System.out.println();
		}
		System.out.println("for printing");
		for(int row = 0; row < currentArray.length; row++)
		{
			for(int col = 0; col < currentArray[0].length; col++)
			{
				System.out.print(row + "," + col + ":" + currentArray[row][col] + "\t");
			}
			System.out.println();
		}
	}
	
	/**
	 * Establishes the String array for the friendsNames information.
	 * @param currentArray
	 */
	public void printStringInformation(String [][] currentArray)
	{
		System.out.println("for each printing");
		for(String [] currentRow: currentArray)
		{
			for(String currentWords : currentRow)
			{
				System.out.print(currentWords + "\t");
			}
			System.out.println();
		}
		System.out.println("for printing");
		for(int row = 0; row < currentArray.length; row++)
		{
			for(int col = 0; col < currentArray[0].length; col++)
			{
				System.out.print(row + "," + col + ":" + currentArray[row][col] + "\t");
			}
			System.out.println();
			
		}
	}

	public void printMonsterInformation(MarhsmellowMan [][] currentArray)
	{
		System.out.println("for each printing");
		for(MarshmellowMan [] currentRow : currentArray)
		{
			for(MarshmellowMan currentMonster : currentRow)
			{
				System.out.print(currentMonster.getName + "\t");
			}
			System.out.println();
		}
		System.out.println("for printing");
		for(int row = 0; row < currentArray.length; row++)
		{
			for(int col = 0; col < currentArray[0].length; col++)
			{
				System.out.print(row + "," + col + ":" + currentArray[row][col].getName() + "\t");
			}
			System.out.println();
		}
	}
}

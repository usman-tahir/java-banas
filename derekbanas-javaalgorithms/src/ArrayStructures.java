
public class ArrayStructures {

	// Contain 50 boxes not 50 values
	private int[] theArray = new int[50];
	
	// Don't want to print out default values, just want to print out the values that have values
	private int arraySize = 10;
	
	public void generateRandomArray() {
		for(int i=0; i<arraySize; i++)
		{
			theArray[i] = (int)(Math.random()*10)+10;
		}
	}
	
	public void printArray()
	{
		System.out.println("----------");
		for(int i = 0; i < arraySize; i++)
		{
			System.out.print("| " + i + " | ");
			System.out.println(theArray[i] + " |");
			System.out.println("-----------");
		}
	}
	
	public int getValueAtIndex(int index)
	{
		if(index < arraySize)
		{
			return theArray[index];
		}
		else
			return 0;
	}
	
	public boolean doesArrayContainThisValue(int searchValue)
	{
		boolean valueInArray = false;
		
		for(int i = 0; i < arraySize; i++)
		{
			if(theArray[i] == searchValue)
			{
				valueInArray = true;
			}
		}
		
		return valueInArray;
		
	}
	
	public void deleteIndex(int index)
	{
		if(index < arraySize)
		{
			for(int i = 0; i < (arraySize - 1); i++)
			{
				theArray[i] = theArray[i + 1];
				
			}
			arraySize--;
		}
	}
	
	public void insertValue(int value)
	{
		if(arraySize < 50)
		{
			theArray[arraySize] = value;
			
			arraySize++;
		}
	}
	
	public String linearSearchForValue(int value)
	{
		boolean valueInArray = false;
		
		String indexsWithValue = "";
		
		System.out.print("The value was found in the following: ");
		
		for(int i = 0; i < arraySize; i++)
		{
			if(theArray[i] == value)
			{
				valueInArray = true;
				
				System.out.print(i + " ");
				
				indexsWithValue+= i + " ";
			}
			
		}
		
		if(!valueInArray)
		{
			indexsWithValue= "None";
			
			System.out.print(indexsWithValue);
		}
		
		System.out.println();
		
		return indexsWithValue;
		
	}
	
	//
	public static void main(String[] args)
	{
		ArrayStructures newArray = new ArrayStructures();
		newArray.generateRandomArray();
		newArray.printArray();
		System.out.println(newArray.getValueAtIndex(3));
		System.out.println(newArray.doesArrayContainThisValue(18));
		newArray.deleteIndex(4);
		newArray.printArray();
		newArray.insertValue(55);
		newArray.printArray();
		newArray.linearSearchForValue(17);
	}
	
}

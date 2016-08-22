/**
 * @(#)HashTable.java
 *
 *
 * @author Snowfoxs
 * @version 1.00 2016/2/3
 */

import java.util.ArrayList;

public class HashTable
{
	// Fields
	private ArrayList<Integer> hashTable = new ArrayList<Integer>();
	private int size;
	private int sum;

	/**
	No arg constructor that sets size to 0 for safety
	*/
	public HashTable()
	{
		size = 0;
	}

	/**
	This method sorts the integer arraylist from lowest to highest
	*/
	public void sortArray()
	{
		boolean flag = true;
		int holdVar = 0;

		while (flag == true)
		{
			flag = false;
        	for(int i = 0; i < hashTable.size(); i++)
        	{
            	for(int j = 1; j < (hashTable.size() -i); j++)
            	{
                	if(hashTable.get(j-1) > hashTable.get(j))
                	{
                    	holdVar = hashTable.get(j-1);
                    	hashTable.set(j-1, hashTable.get(j));
                    	hashTable.set(j, holdVar);
                	}
            	}
        	}
		}

		System.out.println("Sorted Array!");
	}

	/**
	This method adds an element to the hashtable arraylist
	*/
	public void addToTable(int[] arrayData)
	{
		sum = calcHash(arrayData);
		hashTable.add(sum);
		System.out.println("Successfully added " + sum + " to the hashtable");
		sum = 0;
		sortArray();
	}
	/**
	This method displays the hashtable arraylist
	*/
	public void displayHashTable()
	{
		System.out.println("\nPrinting HashTable:\n");
		size = getSize();
		for (int i = 0; i < size; i++)
		{
			System.out.println("\n\t" + hashTable.get(i));
		}
	}
	/**
	This method gets the size of the hashtable arraylist
	@return returns the size
	*/
	public int getSize()
	{
		size = hashTable.size();
		return size;
	}

	/**
	Calculates the "hash" based upon the data passed in. This should be the 
	ascii values for the characters in a char array
	@param Array of integers (ascii values)
	@return the sum of the integers
	*/
	public int calcHash(int[] arrayData)
	{
		int sum = 0;

		for (int i = 0; i < arrayData.length; i++)
		{
			sum = sum + arrayData[i];
		}

		System.out.println("Calculated Hash!");
		return sum;
	}
}
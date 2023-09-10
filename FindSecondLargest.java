package week4.day1.assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest 
{

	public static void main(String[] args) 
	{
		/*
		 * Pseudo Code: 
		 * a) Create a empty Set Using TreeSet
		 * b) Declare for loop iterator from 0 to data.length and add into Set 
		 * c) converted Set into List
		 * d) Print the second last element from List
		 * 
		 * 
		 */
		
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		
		Set<Integer> inputNum = new TreeSet<>();
		
		for(int each:data)
		{
			inputNum.add(each);
		}
		
		List<Integer> sortedNum = new ArrayList<>(inputNum);
		
		int length = sortedNum.size();
		
		System.out.println("Second Largest in Array is: "+ sortedNum.get(length-2));

	}

}

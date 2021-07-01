package practiceOOP;

import java.util.*;

public class iteratorPractice {
	
	public static void main(String[] args)
	{
		LinkedList<Integer> numbers = new LinkedList<Integer>();
		numbers.add(56);
		numbers.add(87);
		numbers.add(23);
		
		Collections.sort(numbers);
		
		Iterator<Integer> it = numbers.iterator();
		Integer values;
		for(int i=0;i<3;i++)
		{
			values = it.next();
			System.out.println(values);
		}
	}
}
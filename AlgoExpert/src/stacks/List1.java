
package stacks;

import java.util.ArrayList;

public class List1 {

	public static void main(String[] args) 
	{
		ArrayList<Integer> l = new ArrayList<Integer>(); // create an array list
		ArrayList<Integer> m = new ArrayList<Integer>(); // create an array list
			
		System.out.println(l); // print the entire list, currently empty
		
		for(int i = 0; i < 10; i++)
		{
			l.add(i * 2); // use the add method
			m.add(i * -2);
		}
		
		System.out.println(l);
		
		System.out.println(l.size()); // display the size of the array list
		
		
		/*
		 * Implement all the methods
		 */
		
		l.add(4, -9); // add at a particular index
		System.out.println(l);
		
		
		System.out.println(l.add(-99)); // return boolean once added at the end
		
		/*
		 * l.clear(); // clear the entire array list System.out.println(l);
		 */
		
		
		l.addAll(m); // add another collection to it
		
		ArrayList<Integer> n = (ArrayList<Integer>) m.clone();
		System.out.println(n);
		
		System.out.println(l);
		System.out.println(l.contains(-99)); // boolean see whether the value is present in the arraylist
		System.out.println(l.get(4));
		
		System.out.println(l.indexOf(-9)); // get the index of



	}

}

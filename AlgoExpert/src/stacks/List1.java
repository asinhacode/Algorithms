
package stacks;

import java.util.ArrayList;
import java.util.Arrays;

public class List1 {

	public static void main(String[] args) 
	{
		ArrayList<Integer> l = new ArrayList<Integer>(); // create an array list
		ArrayList<Integer> m = new ArrayList<Integer>(); // create an array list
		ArrayList<Integer> z = new ArrayList<Integer>(6); // create an array list

			
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

		System.out.println(l.isEmpty());
		
		l.add(-99); // add -99
		System.out.println(l);
		System.out.println("Last index of -99: " +l.lastIndexOf(-99)); // there are 2 instances of -99
		
		l.remove(22); // remove 22 from the arraylist
		System.out.println(l);
		System.out.println("Index of -99: " + l.lastIndexOf(-99));
		
		l.set(11, -100);
		System.out.println(l);

		System.out.println("SIZE OF L: " + l.size());
		
		System.out.println(Arrays.toString(l.toArray()));
		
		Object[] L = l.toArray();
		System.out.println(Arrays.toString(L));
		
		l.trimToSize();
		
		z.add(0);
		z.add(1);
		z.add(2);
		z.add(3);
		
		System.out.println(z.size());
		System.out.println(z);
		z.trimToSize();
		System.out.println(z);



	}

}

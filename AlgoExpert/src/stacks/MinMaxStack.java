package stacks;
import java.util.*;

public class MinMaxStack 
{
	List1<Map<String, Integer>> minMaxStack = new ArrayList<Map<String, Integer>>();
	List1<Integer> stack = new ArrayList<Integer>();
	
	// O(1) time
	public Integer peek()
	{
		return stack.get(stack.size() - 1);
	}
	
	// O(1) time
	public Integer pop()
	{
		minMaxStack.remove(minMaxStack.size() - 1);
		return stack.remove(stack.size() - 1);
	}
	
	
	
}

package array;

@SuppressWarnings("unchecked") // generics troubles
public class Arr<T> implements Iterable <T> {

	private T[] arr;
	private int len = 0;
	private int capacity = 0; // actual array size
	
	public Arr()
	{
		this(16);
	}
	
	public Arr(int capacity)
	{
		if(capacity < 0)
			throw new IllegalArgumentException("Illegal Capacity: " + capacity);
		
		this.capacity = capacity;
		arr = (T[])new Object[capacity]; // casting to type T
	}
	
	public static void main(String[] args) {
		
		
	}

}

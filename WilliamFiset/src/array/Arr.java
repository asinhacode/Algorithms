package array;

@SuppressWarnings("unchecked") // generics troubles
public class Arr<T> implements Iterable<T> {

	// instance variables
	private T[] arr;
	private int len = 0;
	private int capacity = 0; // actual array size

	// constructors
	public Arr() {
		this(16);
	}

	public Arr(int capacity) {
		if (capacity < 0)
			throw new IllegalArgumentException("Illegal Capacity: " + capacity);

		this.capacity = capacity;
		arr = (T[]) new Object[capacity]; // casting to type T
	}

	// simple code
	public int returnSize() {
		return this.len;
	}

	public boolean isEmpty() {
		return returnSize() == 0;
	}

	// getters
	public T getValue(int index) {
		if (index < 0)
			throw new IllegalArgumentException("Index cannot be less than 0: " + index);

		else
			return arr[index];
	}

	public void setValue(int index, T value) {
		if (index < 0)
			throw new IllegalArgumentException("Index cannot be less than 0: " + index);

		arr[index] = value;
	}

	public void clearAllData() {
		for (int i = 0; i < capacity; i++) {
			arr[i] = null;
		}

		len = 0;
	}

	// complication begins
	/**
	 * arr = [1,2,3,4] // size 4 arr.add(5) newArr = new int[8]
	 * 
	 * after copied newArr = [1,2,3,4,8, null, null, null];
	 * arr = [1,2,3,4,8, null, null, null];
	 */
	public void add(T elem) {
		
		if (len + 1 >= capacity) // resize time!
		{
			if (capacity == 0)
				capacity = 1;

			else
				capacity *= 2; // double size

		}

		T[] newArr = (T[]) new Object[capacity];
		for (int i = 0; i < capacity; i++) {
			newArr[i] = arr[i]; // copy individual elements
		}
		arr = newArr; // has some extra nulls
		arr[len++] = elem;
	}

	public static void main(String[] args) {

	}

}

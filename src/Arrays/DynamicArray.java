package Arrays;

import java.util.Iterator;

public class DynamicArray<T> implements Iterable<T> {

	private T[] arr;
	private int len = 0; //default array length
	private int capacity = 0; // default capacity
	
	
	public DynamicArray() {
		// TODO Auto-generated constructor stub
	}

	
	@SuppressWarnings("unchecked")
	public DynamicArray(int capacity) {
		if (capacity < 0) throw new IllegalArgumentException("Illegal capacity: " + capacity);
		this.capacity = capacity;
		arr = (T[]) new Object[capacity];
	}
	
	public int size() {
		return len;
	}
	
	public boolean isEmpty(){
		return (size() == 0);
	}
	
	public T get(int index) {
		return arr[index];
	}
	
	public void set(int index, T elem) {
		arr[index] = elem;
	}
	
	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

}

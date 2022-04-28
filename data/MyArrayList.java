package data;

import java.util.Arrays;

public class MyArrayList<T> {

    private Object[] elements;
    private int size;
    // temporary capacity of array when first created
    private static int DEFAULT_CAPACITY = 10000000; 
    // get rid of unchecked cast trom Object
    @SuppressWarnings("unchecked")

    // constructor
    public MyArrayList() {
        elements = (T[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    // method: add element to the last position
    public void add(T obj) {
        if (size > elements.length) {
            increaseCapa();
        }
        elements[size] = obj;
        size++;
    }

    // method: add element to a specific position
    public void add(int index, T obj) {
        if (size == elements.length) {
            increaseCapa();
        }
        for (int i = size - 1; i > index - 1; i--) {
            elements[i + 1] = elements[i];
        }
        elements[index] = obj;
        size++;
    }

    // get rid of unchecked cast trom Object
    @SuppressWarnings("unchecked")

    // method: return element of a specific position
    public T get(int index) throws Exception {
        if (index < size) {
            return (T) elements[index];
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    // automatically increase capacity of array when full
    private void increaseCapa() {
        this.size = this.size + DEFAULT_CAPACITY;
        Object newData[] = new Object[this.size];
		for(int i=0; i < elements.length; i++){
			newData[i] = elements[i];
		}
		this.elements = newData;
    }

    // return number of element in arrays, not full capacity
    public int size() {
        return size;
    }
}

package data;

public class MyArrayList<T> {

    private Object[] elements;
    private int currentElements;
    private int actualSize;
    // temporary capacity of array when first created
    private static int DEFAULT_CAPACITY = 100; 
    // get rid of unchecked cast trom Object
    @SuppressWarnings("unchecked")

    // constructor
    public MyArrayList() {
        elements = (T[]) new Object[DEFAULT_CAPACITY];
        actualSize = DEFAULT_CAPACITY;
        currentElements = 0;
    }

    // method: add element to the last position
    public void add(T obj) {
        if (currentElements == elements.length-1) {
            increaseCapa();
        }
        elements[currentElements] = obj;
        currentElements++;
    }

    // method: add element to a specific position
    public void add(int index, T obj) {
        if (currentElements == elements.length-1) {
            increaseCapa();
        }
        for (int i = currentElements - 1; i > index - 1; i--) {
            elements[i + 1] = elements[i];
        }
        elements[index] = obj;
        currentElements++;
    }

    // get rid of unchecked cast trom Object
    @SuppressWarnings("unchecked")

    // method: return element of a specific position
    public T get(int index) throws Exception {
        if (index < currentElements) {
            return (T) elements[index];
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    // automatically increase capacity of array when full
    private void increaseCapa() {
        this.actualSize = this.actualSize + DEFAULT_CAPACITY;
        Object newData[] = new Object[this.actualSize];
		for(int i=0; i < elements.length-1; i++){
			newData[i] = elements[i];
		}
		this.elements = newData;
    }

    // return number of element in arrays, not full capacity
    public int size() {
        return currentElements;
    }
}

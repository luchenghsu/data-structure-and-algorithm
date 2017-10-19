public class ArrayList {
	private int[] items;
	private int size = 0;


    public ArrayList(int initialCapacity) {
        if (initialCapacity < 0) {
            throw new IllegalArgumentException("Illegal Capacity: "+ initialCapacity);
        }
        this.items = new int[initialCapacity];
    }

    public ArrayList() {
        this(10);
    }

	public int size() {
		return size;
	}

	public void set(int index, int item) {
        if (index < 0 || index >= size) {
        	throw new ArrayIndexOutOfBoundsException(index);
        }
        items[index] = item;
	}

	public void append(int item) {
        ensureExtraCapacity();
        items[size] = item;
        size++;
	}

    private void ensureExtraCapacity() {
    	if (size == items.length) {
    		int[] copy = new int[size * 2];
    		System.arraycopy(items, 0, copy, 0, size);
    		items = copy;
    	}
    }

	public int get(int index) {
        if (index < 0 || index >= size) {
        	throw new ArrayIndexOutOfBoundsException(index);
        }
        return items[index];
	}
}
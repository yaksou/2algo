import java.util.*;

public class MyArrayList<AnyType> implements Iterable<AnyType> {

	private AnyType[] list;
	private int count;

	public MyArrayList() {
		list = (AnyType[]) new Object[10];
		count = 0;
	}

	public MyArrayList(int initialCapacity) {
		list = (AnyType[]) new Object[initialCapacity];
	}

	/* Appends the specified element to the end of this list. */

	public boolean add(AnyType object) {
		if (object != null) {
			if (count == list.length) {
				Object[] beamer = (AnyType[]) new Object[count * 2];

				for (int i = 0; i < count; i++) {
					beamer[i] = list[i];

				}
				list = (AnyType[]) beamer;
			}
			list[count] = object;
			count++;
			return true;
		}
		return false;
	}

	/** tests if the specified element is a component of this list */
	public boolean contains(AnyType object) {
		for (int i = 0; i < count; i++) {
			if (list[i] == object) {
				return true;
			}
		}
		return false;

	}

	/** returns the component at the specified index */
	public AnyType get(int index) {
		if (index >= count || index < 0) {
			throw new IndexOutOfBoundsException("Index does not exist");
		}
		return list[index];
	}

	/**
	 * Search for the first occurrence of the given argument testing for the
	 * equality using equals method
	 */
	public int indexOf(AnyType object) {
		for (int index = 0; index < list.length; index++) {
			if (list[index] == object) {
				return index;
			}
		}
		return -1;
	}

	/** tests if this list has no components */
	public boolean isEmpty() {
			if (count == 0) return true;
				return false;
	}

	/**
	 * removes the first occurrence of the specified element in this list if the
	 * list contains the
	 */
	public boolean remove(AnyType object) {
		for (int i = 0; i < count; i++) {
			if (list[i].equals(object)) {
				for (int j = i; j < count; j++) {
					list[j] = list[j + 1];
				}
				count--;
				return true;
			}
		}
		return false;
	}

	/** returns the number of components in this list */
	public int size() {
		return count;

	}

	/**
	 * returns an array containing all elements in this list in the correct
	 * order
	 */
	public Object[] toArray() {
		if(count == 0){
			Object[]boyish = null;
			return boyish;
		}
		
		Object[] boyish = new Object[count];
		for (int i = 0; i < list.length; i++) {
			boyish[i] = list[i];
		}
		return boyish;
	}

	public Iterator<AnyType> iterator() {
		ArrayListIterator<AnyType> bam = new ArrayListIterator<>(list, count);
		return bam;
	}

	public static void main(String[] args) {

	}

}
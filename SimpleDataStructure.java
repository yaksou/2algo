import java.util.*;

public class SimpleDataStructure {
	private String[] friends;
	private int counter;

	public SimpleDataStructure() {
		friends = new String[5];
		counter = 0;
	}

	/* Appends the other friend name to the end of this list. */
	public boolean add(String other) {
		if (counter == friends.length) {
			String[] kompis = new String[counter * 2];

			for (int i = 0; i < counter; i++) {
				kompis[i] = friends[i];

			}
			friends = kompis;
		}
		friends[counter] = other;
		counter++;
		return true;
	}

	public boolean addSort(String other) {
		if (counter == friends.length) {
			String[] kompis = new String[counter * 2];

			for (int i = 0; i < counter; i++) {
				kompis[i] = friends[i];

			}
			friends = kompis;
		}
		for (int i = 0; i < friends.length; i++) {
			if (friends[i].compareTo(other) >= 0) {
				this.insert(other, i);
				return true;
			}
		}
		return true;
	}

	public boolean insert(String other, int index) {
		if (index < 0 || index > counter) {
			return false;
		}
		for (int i = index; i < counter + 1; i++) {
			String kompis = friends[i];
			friends[i] = other;
			other = kompis;
		}
		counter++;
		return true;
	}

	/** returns the name at the specified index */
	public String get(int index) {
		if (index < 0 || index > friends.length - 1) {
			return null;
		}
		return friends[index];
	}

	/**
	 * removes the first occurrence of the specified element in this list if the
	 * list contains the name
	 */
	public boolean remove(String name) {
		for (int i = 0; i < counter; i++) {
			if (friends[i].equals(name)) {
				for (int j = i; j < counter; j++) {
					friends[j] = friends[j + 1];

				}
				counter--;
				return true;
			}
		}
		return false;
	}

	/** prints all names in the array friends */
	public void printFriends() {
		for (int i = 0; i < friends.length; i++)
			if (friends[i] != null) {
				System.out.print(friends[i] + " ");
				System.out.println();
			}

	}

	public static void main(String[] arg) {
		SimpleDataStructure myfriends = new SimpleDataStructure();

		myfriends.add("Gustav");
		myfriends.add("Jenny");
		myfriends.add("Johan");
		myfriends.add("Kalle");
		myfriends.add("Mona");
		myfriends.add("Tommy");
		myfriends.remove("Mona");
		myfriends.remove("Gustav");
		myfriends.printFriends();

		 System.out.println();
		System.out.println(myfriends.get(3));
		 System.out.println(myfriends.get(4));

		myfriends.addSort("Gustav");
		myfriends.addSort("Jenny");
		myfriends.addSort("Johan");
		myfriends.addSort("Kalle");
		myfriends.addSort("Mona");
		myfriends.addSort("Tommy");

	}
}

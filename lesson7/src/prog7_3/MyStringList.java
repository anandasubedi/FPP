package prog7_3;

import prog7_3.employeeinfo.Account;

public class MyStringList {
	private int size = 0;
	private final int ARRAY_SIZE = 2;
	private Account[] AcctArray;

	public MyStringList() {
		AcctArray = new Account[ARRAY_SIZE];
	}

	public void add(Account s) {
		if (size >= AcctArray.length)
			resize();
		AcctArray[size++] = s;
	}

	public boolean find(Account s) {
		for (int i = 0; i < size; ++i) {
			if (s.equals(AcctArray[i]))
				return true;
		}
		return false;
	}

	public Account get(int i) {
		if (i < 0 || i >= size)
			return null;
		return AcctArray[i];
	}

	public void remove(Account str) {
		Account[] tempArray = new Account[AcctArray.length];
		int j = 0;
		for (int i = 0; i < AcctArray.length; i++) {
			if (!AcctArray[i].equals(str)) {
				tempArray[j] = AcctArray[i];
				j++;
			}
		}
		AcctArray = tempArray;
	}

	private void resize() {
		System.out.println("Resizing from size " + AcctArray.length + "to " + 2
				* AcctArray.length);
		Account[] temp = new Account[2 * AcctArray.length];
		for (int i = 0; i < AcctArray.length; ++i) {
			temp[i] = AcctArray[i];
		}
		AcctArray = temp;
	}
}
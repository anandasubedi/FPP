package prog7_3;

import prog7_3.employeeinfo.Account;

public class AccountList {
	private int size = 0;
	private final int INIT_ARR_SIZE = 2;
	private Account[] strArray;

	public AccountList() {
		strArray = new Account[INIT_ARR_SIZE];
	}

	public void add(Account s) {
		if (size >= strArray.length)
			resize();
		strArray[size++] = s;
	}

	public boolean find(String s) {
		for (int i = 0; i < size; ++i) {
			if (s.equals(strArray[i]))
				return true;
		}
		return false;
	}

	public Account get(int i) {
		if (i < 0 || i >= size)
			return null;
		return strArray[i];
	}

	public boolean remove(Account s) {
		Account[] temp = null;
		boolean found = false;
		for (int i = 0; i < size; i++) {
			if (strArray[i].equals(s)) {
				temp = new Account[--size];
				strArray[i] = null;
				found = true;
				break;
			}
		}
		if (found) {
			for (int i = 0, j = 0; i < strArray.length; i++) {
				if (strArray[i] != null) {
					temp[j] = strArray[i];
					j++;
				}
			}
			strArray = temp;
			return true;
		}
		return false;
	}

	public int size() {
		return size;
	}

	private void resize() {
		Account[] temp = new Account[2 * strArray.length];
		for (int i = 0; i < strArray.length; ++i) {
			temp[i] = strArray[i];
		}
		strArray = temp;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (int i = 0; i < size; i++) {
			if (sb.length() != 1) {
				sb.append(", ");
			}
			sb.append(strArray[i]);
		}
		sb.append("]");
		return sb.toString();
	}

}
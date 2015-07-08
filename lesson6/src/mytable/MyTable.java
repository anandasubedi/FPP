package mytable;

public class MyTable {

	private Entry[] entries;

	public MyTable() {
		entries = new Entry[26];
	}

	// returns the String that is matched with char c in the table
	public String get(char c) {
		// implement
		int index = getPosition(c);
		return entries[index].toString();
	}

	// adds to the table a pair (c, s) so that s can be looked up using c
	public void add(char c, String s) {
		int index = getPosition(c);
		entries[index] = new Entry(c, s);
	}
	
	private int getPosition(char c){
		int index=0;
		for (int i = 0; i <= 26; ++i) {
			if (c == i + 97) {
				index = i;
				break;
			}
		}
		return index;
	}

	// returns a String consisting of nicely formatted display
	// of the contents of the table
	public String toString() {
		StringBuilder builder = new StringBuilder();
		for (Entry entry : entries) {
			if (entry != null)
				builder.append(entry).append("\n");
		}
		return builder.toString();
	}

	private class Entry {
		char ch;
		String str;

		Entry(char ch, String str) {
			this.ch = ch;
			this.str = str;
		}

		public String toString() {
			// implement
			return ch + "->" + str;
		}
	}

	public static void main(String[] args) {
		MyTable t = new MyTable();
		t.add('a', "Andrew");
		t.add('w', "Willie");
		t.add('b', "Billy");
		System.out.println(t);
		System.out.println(t.get('w'));
	}
}
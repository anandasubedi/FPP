package prog3_3;

public class MyStringList {
	
	String[]  strArray = null;
	int size;
	
	public MyStringList()
	{
		strArray = new String[2]; 
		size = 0;
	}

	// adds String s to the end of the array
	public void add(String s){
		
		if(size == strArray.length)
			resize();
		
		strArray[size] = s;
		size++;		
	}

	// retrieves the String at the ith position in the underlying array
	public String get(int i) {		
		
		if(i<size)	
		{
			return strArray[i];			
		}
		else
			return "empty index";
	}

	// returns true if String s is found in the array, false otherwise
	public boolean find(String s) {
		
		for(int i=0; i< size; i++)
		{
			if (strArray[i].equals(s))
			{
				return true;
			}			
		}		
		return false;
	}

	// removes first occurrence of String s if it is found in the underlying
	// array if found, returns true; if not found returns false
	public boolean remove(String s) {
		
		int index = 0; 
		for(int i=0; i< size; i++)
		{
			if (strArray[i].equals(s))
			{	
				index = i;
				while(index< size -1)
				{					
					strArray[index] = strArray[index+1];
					strArray[index+1] = null;
					index++;					
				}				
				size --;
				return true;												
			}				
		}			
		return false;
	}

	// returns a String representation of the underlying array
	// [Bob, Steve, Susan, Mark, Dave]
	public String toString() {
	 
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for(int i=0; i<size ; i++)
		{
			sb.append(strArray[i]);
			if(i != size-1)
				sb.append(",");
		}		
		sb.append("]");
		
		return sb.toString();
		
	}

	/*
	* returns the next open position in the underlying array – this is
	* precisely the number of Strings that have been added minus the number of
	* String that have been removed
	*/
	public int size() {
		return size;
	}

	private void resize() {
		
		System.out.println("Resizing...");
		
		String[] newStrArray = new String[strArray.length * 2];
					
		System.arraycopy(strArray, 0, newStrArray, 0, strArray.length);
			
		strArray = newStrArray;
	}
}
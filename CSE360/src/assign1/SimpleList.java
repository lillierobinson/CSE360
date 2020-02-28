package assign1;


public class SimpleList {
	
	private int[] list;
	private int count;
	
	
	public SimpleList() {
		count = 0;
		list = new int[10];
	}
	
	public void Add(int to_be_added) {
		
		//when the array is full, increase size 
		if(list.length == count) {
			
		//calculate the new size of the array 
		int size = (int) (list.length * 1.5);
		
		int[] newArray = new int[size];
		
		//copy the list into the array of a new size
		for(int i = 0; i < list.length; i++) {
			newArray[i] = list[i];
		}
		
		
		//reinstate list
		list = newArray;
		
		}//end if statement
		
		//shift all the elements over
		for (int i = count; i > 0; i--) {
			
			list[i] = list[i - 1];
			
		}		
		
		//initialize the first element of the array 
		list[0] = to_be_added;
		
		count();
		
		
	}
		
				


	public void Remove(int to_be_removed) {
		
		
		//create a reference variable for help with moving
		int index = 0;
		//iterate through list 
		for(int i = 0; i < list.length; i++) {
			
			//move the element to the next space when not removing 
			if(list[i] != to_be_removed) {
				list[index++] = list[i];
			}
		}

		//calculate the size that the newArray will be and call count for accuracy   
		int size = (int) (list.length * 0.75);
		count = count();
		
		//call only if 25% of array is empty 
		if(count <= size) {
			int newArray[] = new int[size];
			
			for(int i = 0; i <= size - 1; i++) {
				newArray[i] = list[i];
			}
			
			list = newArray;
		}
		
		
	}
	
	public int count() {
		count = 0;
		//count the number of items in array list
		for(int k = 0; k < list.length; k++) {
			
			if(list[k] != 0) {
				count++;
			}
		}
		return count;
	}
	
	public String toString() {
		//returns the array list as a String with a space between each variable and no space after the last element
		
		
		
		//declare an empty string 
		String s = "";
		
		//turn each element into a string with a space after
		for(int i = 0; i < list.length; i++) {
			
			if(list[i] != 0) {
			
			s = s + Integer.toString(list[i]) + " ";
			}
						
		}
		
		//get the substring that excludes the last space in the program 
		String str = s.substring(0, s.length() - 1);
		
		return str; 
		
		
	}
	
	public int search(int to_be_searched_for) {
		//search the list for the variable and return the location. If not present, return -1
		
		
		//create external iterator for for loop
		int k = 0;
		
		int n = list.length;

		//loop through each element checking if value is present
		for(k = 0; k < n; k++) {
			
			if (list[k] == to_be_searched_for) { 
				return k;		
			}
			
		}
		
			return -1;
		}
}
		
	
	



package assign2;


public class SimpleList {
	
	private int[] list;
	private int count;
	
	public SimpleList() {
		count = 0;
		int num = 10;
		list = new int[num];
	}
	
	public void Add(int to_be_added) {
		
		count = 0;
		
		for (int i = 0; i < list.length; i++) {
			if (list[i] == 0) {
				list[i] = to_be_added;
				count++;
				break;
			}
		}		
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
		int num = (int) (10*.75);
		System.out.println(num);
		
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
		
	
	



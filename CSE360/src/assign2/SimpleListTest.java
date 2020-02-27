package assign2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SimpleListTest {

	@Test
	void test_add() {
		//fail("Not yet implemented");
		
		//create an object of type SimpleList
		SimpleList sl = new SimpleList();
		
		//add the number 4 to the array 
		sl.Add(4);
		
		//add the number 8 to the array
		sl.Add(8);
		
		//add the number 2 to the array
		sl.Add(2);

		//create an integer to store the observed value recorded in add()
		int add_test = sl.count();
		
		//test if the expected value is the same as the add_test value
		assertEquals(3, add_test); 
		
	}
	
	@Test
	void test_Remove() {
		//fail("Not yet implemented");
		
		SimpleList sl = new SimpleList();
		
		//add the number 4 to the array
		sl.Add(4);
		
		//add the number 8 to the array
		sl.Add(8);
		
		//add the number 2 to the array
		sl.Add(2);
		
		//remove one to test if the remove method works
		sl.Remove(8);
		
		//create an integer to store the observed value recorded in remove()
		int remove_test = sl.count();
		
		//test if the expected value is the same as observed
		assertEquals(2, remove_test);
	}
	
	
	@Test
	void test_toString() {
		//fail("Not yet implemented");
		
		SimpleList sl = new SimpleList();
		
		//add the number 4 to the array 
		sl.Add(4);
				
		//add the number 8 to the array
		sl.Add(8);
				
		//add the number 2 to the array
		sl.Add(2);
		
		//store the observed value of the toString() method
		String str = sl.toString();
		
		//test if the expected value is the same as observed for toString()
		assertEquals("4 8 2", str);
	}
	
	@Test
	void test_search() {
		//fail("Not yet implemented");
		
		SimpleList sl = new SimpleList();
		
		//add the number 4 to the array 
		sl.Add(4);
						
		//add the number 8 to the array
		sl.Add(8);
							
		//add the number 2 to the array
		sl.Add(2);
		
		//create an integer to store the observed value of search test
		int search_test = sl.search(2);
		
		//test if the expected and observed match for search()
		assertEquals(2, search_test);
		
		
		
	}
	
	@Test
	void test_count() {
		
		SimpleList sl = new SimpleList();
		
		//add the number 4 to the array 
		sl.Add(4);
				
		//add the number 8 to the array
		sl.Add(8);
						
		//add the number 2 to the array
		sl.Add(2);
		
		
		int count_test = sl.count();
		
		assertEquals(3, count_test);

	}
	
	
	
	

}

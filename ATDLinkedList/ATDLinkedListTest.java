package ATDLinkedList;

import static org.junit.Assert.*;

import org.junit.Test;

public class ATDLinkedListTest {

	@Test
	public void remove_test() {
		MyLinkedList<Integer> list = new MyLinkedList<Integer>();
		
		for(int i = 0; i < 10; i++) {
			list.add_tail(i);
		}
		
		list.remove();
		
		assertTrue(list.get_remove_status() == list.REMOVE_NF);
		
		list.find(5);
		assertTrue(list.get_find_status() == list.FIND_OK);
		list.find(200);
		assertTrue(list.get_find_status() == list.FIND_NF);
		
		list.remove();
		list.find(5);
		assertTrue(list.get_find_status() == list.FIND_NF);
		
		for(int i = 0; i < 9; i++)
			list.remove();
	
		assertTrue(list.size() == 0);
		
		list.remove();
		
		assertTrue(list.get_remove_status() == list.REMOVE_NF);
	}
	
	@Test
	public void put_test() {

		MyLinkedList<Integer> list = new MyLinkedList<Integer>();
		
		for(int i = 0; i < 10; i++) {
			list.add_tail(i);
		}
		
		list.find(5);
		
		list.put_right(12);
		list.right();
		
		assertTrue(list.get() == 12);
		list.right();
		assertTrue(list.get() == 6);
	}
}

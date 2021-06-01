package ParentList;

import static org.junit.Assert.*;

import org.junit.Test;

public class TwoWayListTest {

	@Test
	public void test() {
		TwoWayList<Integer> list = new TwoWayList<Integer>();
		for(int i = 0; i < 10; i++)
			list.add_tail(i);
		list.find(9);
		assertTrue(list.get() == 9);
		
		list.left();
		list.left();
		assertTrue(list.get() == 7);
		
		
	}

}

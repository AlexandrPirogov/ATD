package ATDPowerSet;

import static org.junit.Assert.*;

import org.junit.Test;

public class JUnitPowerSet {

	@Test
	public void test_put() {
		MyPowerSet<String> set = new MyPowerSet<String>(String.class);
		set.put("hi");
		set.put("hello");
		set.put("nihao");
		
		assertTrue(set.size() == 3);
		
		set.put("hi");
		set.put("hello");
		set.put("nihao");
		
		assertTrue(set.size() == 3);
		
		assertTrue(set.isExists("hi"));
		assertTrue(set.isExists("nihao"));
		assertTrue(set.isExists("hello"));
		assertFalse(set.isExists("privet"));

	}
	
	@Test
	public void test_remove() {
		MyPowerSet<String> set = new MyPowerSet<String>(String.class);
		set.put("hi");
		set.put("hello");
		set.put("nihao");
		
		set.remove("hi");
		assertTrue(set.get_remove_status() == 1);
		
		set.remove("privet");
		assertFalse(set.get_remove_status() == 1);
		
	}
	
	@Test
	public void test_get() {
		MyPowerSet<String> set = new MyPowerSet<String>(String.class);
		set.put("hi");
		set.put("hello");
		set.put("nihao");
		
		set.get("hi");
		assertTrue(set.isExists("hello"));
	}

}

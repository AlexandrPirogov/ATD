package ATDHashTable;

import static org.junit.Assert.*;

import org.junit.Test;

public class JUnitHashTable {

	@Test
	public void test() {
		//тестил через отладку
		MyHashTable<String> s = new MyHashTable<String>(String.class);
		s.put("asd");
		s.put("xxxx");
		s.put("sasaha");
		s.put("bbb");
		s.put("hhhh");
		s.put("nnnnn");
		s.put("bbbbb");
		s.put("bfbfbfb");
		s.put("nnnnnn");
		s.put("mmm");
		s.put("yyy");
		s.put("iiii");
		s.put("xxxx");
		s.put("sasaha");
		s.put("bbb");
		s.put("hhhh");
		s.put("nnnnn");
		s.put("bbbbb");
		s.put("bfbfbfb");
		s.put("nnnnnn");
		s.put("mmm");
		s.put("yyy");
		s.put("iiii");
		
		System.out.println(s.get("yyy"));
	}

}

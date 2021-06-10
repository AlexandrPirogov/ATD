package ADTBloomeFilter;

import static org.junit.Assert.*;

import org.junit.Test;

public class JUnitFilterBloome {

	@Test
	public void test() {
		MyFilterBloom<String> bf = new MyFilterBloom<String>(32);
		bf.get("0123456789");
		bf.get("1234567890");
		bf.get("2345678901");
		bf.get("3456789012");
		bf.get("4567890123");
		bf.get("5678901234");
		bf.get("6789012345");
		bf.get("7890123456");
		bf.get("8901234567");
		bf.get("9012345678");
		
		assertFalse(bf.get("4567890123"));
	}

}

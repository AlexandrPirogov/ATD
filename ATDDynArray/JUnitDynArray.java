package ATDDynArray;

import static org.junit.Assert.*;

import org.junit.Test;

public class JUnitDynArray {

	@Test
	public void test() {
		MyDynArray<Integer> arr = new MyDynArray<Integer>(Integer.class);
		for(int i = 0; i < 25; i++) {
			arr.add(i, 0);
		}
		
		
		arr.remove(15);
		arr.remove(15);
		arr.remove(15);
		
		//Пересмотреть аксиомы в АТД
		//Вернуться к динамическуму массиву позже
	}

}

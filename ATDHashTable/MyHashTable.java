package ATDHashTable;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MyHashTable<T> extends ATDHashTable<T> {

	private int put_status;
	private int get_status;
	private Class clz;
	
	private int capacity;
	private T[] dynArray;
	private int step;
	
	public MyHashTable(Class cls) {
		// TODO Auto-generated constructor stub
		this.get_status = 0;
		this.put_status = 0;
		this.capacity = 10;
		this.clz = cls;
		this.step = 3;
		this.makeArray(this.capacity);
	}
	
	@Override
	public void put(T value) {
		// TODO Auto-generated method stub
		int possiblePosition = seekSlot(value);
		if(possiblePosition != -1) {
			this.dynArray[possiblePosition] = value;
			this.put_status = this.PUT_OK;
		} else {
			this.put_status = this.PUT_OK;
		}
	}
	
	private int hash_func(T value) {
		String stringed_value = String.valueOf(value);
		byte[] bytes = stringed_value.getBytes();
		int summ = 0;
		for(int i = 0; i < bytes.length; i++) {
			summ += bytes[i];
		}
		return summ % this.capacity;
	}
	
	private  int seekSlot(T value) {
		if(isFilled())
			makeArray(this.capacity*2);
		int indx = hash_func(value);
		if (this.dynArray[indx] == null)
			return indx;
		else {
			int steps = 0;
			int tries = 0;
			while(true) {
				tries++;
				steps +=step;
				indx = steps % (this.capacity);
				if(this.dynArray[indx] == null)break;
			}
			if(tries > 3)return -1; //Имитация ограничения разрешений коллизий
			return indx;
		}
	}
	
	private boolean isFilled() {
		int i = 0;
		while (i < this.capacity) {
			if(this.dynArray[i] == null)return false;
			i++;
		}
		return true;
	}
	

	private void makeArray(int new_capacity) {
		if (new_capacity < 16)
			new_capacity = 16;
		try {
			this.dynArray = Arrays.copyOf(this.dynArray, new_capacity);
			capacity = new_capacity;
		} catch (Exception e) {
			// TODO: handle exception
			this.dynArray = (T[]) Array.newInstance(this.clz, new_capacity);
			capacity = new_capacity;
		}
	}

	@Override
	public int get(T value) {
		// TODO Auto-generated method stub
		for(int i = 0; i < this.capacity; i++) {
			if(this.dynArray[i] == value) {
				this.get_status = this.GET_OK;
				return i;
			}
		}
		this.get_status = this.GET_ERR;
		return -1;
	}
	
	
	

}

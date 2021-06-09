package ATDPowerSet;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MyPowerSet<T> extends ADTPowerSet<T> {

	private T[] array;
	private int capacity;
	private int size;
	private Class clz;
	
	private int put_status;
	private int remove_status;
	
	
	public MyPowerSet(Class clz){
		this.clz = clz;
		this.capacity = 3;
		this.size = 0;
		this.makeArray(this.capacity, clz); 
	}
	
	@Override
	public void put(T value) {
		// TODO Auto-generated method stub
		int index = seekSlot(value);
		if(this.array[index] == null)size++;
		this.array[index] = value;
		
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
			makeArray(this.capacity*2, this.clz);
		int indx = hash_func(value);
		if (this.array[indx] == null || this.array[indx] == value)
			return indx;
		else {
			int steps = 0;
			while(true) {
				steps ++;
				indx = steps % (this.capacity);
				if(this.array[indx] == null)break;
			}
			return indx;
		}
	}
	
	private boolean isFilled() {
		int i = 0;
		while (i < this.capacity) {
			if(this.array[i] == null)return false;
			i++;
		}
		return true;
	}
	

	private void makeArray(int new_capacity, Class clz) {
		if (new_capacity < 16)
			new_capacity = 16;
		try {
			this.array = Arrays.copyOf(this.array, new_capacity);
			capacity = new_capacity;
		} catch (Exception e) {
			// TODO: handle exception
			this.array = (T[]) Array.newInstance(this.clz, new_capacity);
			capacity = new_capacity;
		}
	}

	@Override
	public void remove(T value) {
		// TODO Auto-generated method stub
		boolean isFind = false;
		for(int i = 0; i < this.capacity; i++)
			if(this.array[i] == value)
				isFind = true;
		
		if(isFind)
			this.remove_status = this.REMOVE_OK;
		else
			this.remove_status = this.REMOVE_ERR;
	}

	@Override
	public int get(T value) {
		// TODO Auto-generated method stub
		int indx = seekSlot(value);
		int isFind = -1;
		if(this.array[indx] == value)
			isFind = indx;
		else {
			for(int i = indx; i < this.capacity; i++) {
				if(this.array[i] == value)isFind = i;
			}
		}
		return isFind;
	}
	
	@Override
	public boolean isExists(T value) {
		// TODO Auto-generated method stub
		int indx = seekSlot(value);
		boolean isFind = false;
		if(this.array[indx] == value)
			isFind = true;
		else {
			for(int i = indx; i < this.capacity; i++) {
				if(this.array[i] == value)isFind = true;
			}
		}
		return isFind;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return this.size;
	}

	@Override
	public int get_put_status() {
		// TODO Auto-generated method stub
		return this.put_status;
	}

	@Override
	public int get_remove_status() {
		// TODO Auto-generated method stub
		return this.remove_status;
	}



}

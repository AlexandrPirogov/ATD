package ATDDictionaryMap;

import java.lang.reflect.Array;

public class DictionaryMap<T> extends ATDDictionaryMap<T> {

	private String[] key;
	private T[] values;
	
	private int size;
	private int count;
	private int step;
	
	private int insert_status;
	private int remove_status;
	private int get_status;
	private int find_status;
	
	public DictionaryMap(Class clz, int size) {
		// TODO Auto-generated constructor stub
		this.size = size;
		key = new String[size];
		step = 2;
		values = (T[]) Array.newInstance(clz, this.size);
	}
	

	private int hash_func(String value) {
		String stringed_value = String.valueOf(value);
		byte[] bytes = stringed_value.getBytes();
		int summ = 0;
		for(int i = 0; i < bytes.length; i++) {
			summ += bytes[i];
		}
		return summ % this.size;
	}
	
	private  int seekSlot(String value) {
		if(isFilled())
			return -1;
		int indx = hash_func(value);
		if (this.key[indx] == null)
			return indx;
		else {
			int steps = 0; 
			while(true) {
				steps +=step;
				indx = steps % (this.size);
				if(this.key[indx] == value)break;
				if(this.key[indx] == null)break;
			}
			return indx;
		}
	}
	
	private boolean isFilled() {
		int i = 0;
		while (i < this.size) {
			if(this.key[i] == null)return false;
			i++;
		}
		return true;
	}
	@Override
	public void insert(String key, T value) {
		// TODO Auto-generated method stub
		int index = this.seekSlot(key);
		if(index == -1) {
			this.insert_status = this.INSERT_ERR;
		} else {
		this.key[index] = key;
		this.values[index] = value;
		this.insert_status = this.INSERT_OK;
		}
	}

	@Override 
	public void remove(T value) {
		// TODO Auto-generated method stub
		boolean isFind = false;
		for(int i = 0; i < values.length; i++) {
			if(values[i] == value) {
				values[i] = null;
				isFind = true;
				break;
			}
		}
		if(isFind) this.remove_status = this.REMOVE_OK;
		else this.remove_status = this.REMOVE_ERR;
	}

	@Override
	public T get(String key) {
		int isFind = -1;
		// TODO Auto-generated method stub
		for(int i = 0; i < this.key.length; i++) {
			if(this.key[i] == key) {
				isFind = i;
				break;
			}
		}
		return this.values[isFind];
	}

	@Override
	public String find(T value) { //findKey
		// TODO Auto-generated method stub
		int isFind = -1;
		// TODO Auto-generated method stub
		for(int i = 0; i < this.values.length; i++) {
			if(this.values[i] == value) {
				isFind = i;
				break;
			}
		}
		return this.key[isFind];
	}

	@Override
	public int get_get_status() {
		// TODO Auto-generated method stub
		return this.get_status;
	}

	@Override
	public int get_find_status() {
		// TODO Auto-generated method stub
		return this.find_status;
	}

	@Override
	public int get_remove_status() {
		// TODO Auto-generated method stub
		return this.remove_status;
	}

	@Override
	public int get_insert_status() {
		// TODO Auto-generated method stub
		return this.insert_status;
	}

}

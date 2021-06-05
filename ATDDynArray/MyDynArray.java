package ATDDynArray;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MyDynArray<T> extends ATDDynArray<T> {

	private T[] xxx;
	// statuses

	private int add_status;
	private int remove_status;
	private int capacity;
	private int count;
	private Class clz;

	public MyDynArray(Class clz) {
		// TODO Auto-generated constructor stub
		this.capacity = 16;
		this.clz = clz;
		this.count = 0;
		makeArray(capacity);
	}

	public MyDynArray(Class clz, int capacity) {
		if (capacity < 16)
			this.capacity = 16;
		else
			this.capacity = capacity;
		this.count = 0;
		makeArray(capacity);
	}

	private void makeArray(int new_capacity) {
		if (new_capacity < 16)
			new_capacity = 16;
		try {
			xxx = Arrays.copyOf(xxx, new_capacity);
			capacity = new_capacity;
		} catch (Exception e) {
			// TODO: handle exception
			xxx = (T[]) Array.newInstance(this.clz, new_capacity);
			capacity = new_capacity;
		}

		count = this.count;
	}

	@Override
	public void add(T item, int index) {
		if (index < 0 || index > this.capacity)
			this.add_status = 2;
		else {
			// TODO Auto-generated method stub
			if (this.count == this.capacity)
				makeArray(this.capacity * 2);
			int tmpIndex = this.count;
			while (tmpIndex != index) {
				this.xxx[tmpIndex] = this.xxx[tmpIndex - 1];
				tmpIndex--;
			}
			this.count++;
			this.xxx[index] = item;
			this.add_status = 1;
		}
	}

	@Override
	public void remove(int index) {
		if(index < 0 || index > this.capacity)this.remove_status = 2;
		else {
			// TODO Auto-generated method stub
			this.xxx[index] = null;
			for(int i = index; i < count-1; i++)
				this.xxx[i] = 	this.xxx[i+1];
			this.xxx[count-1] = null;
			count--;
			this.remove_status = 1;
		}
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return this.count;
	}

	@Override
	public int capacity() {
		// TODO Auto-generated method stub
		return this.capacity;
	}

	@Override
	public T getItem(int index) {
		// TODO Auto-generated method stub
		return this.xxx[index];
	}

	@Override
	public int getIndex(T item) {
		// TODO Auto-generated method stub
		for (int i = 0; i < this.count; i++)
			if (this.xxx[i] == item)
				return i;
		return -1;
	}

	@Override
	public int get_add_status() {
		// TODO Auto-generated method stub
		return this.add_status;
	}

	@Override
	public int get_remove_status() {
		// TODO Auto-generated method stub
		return this.remove_status;
	}

}

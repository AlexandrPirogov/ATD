package ParentList;

import java.util.LinkedList;

public class ParentList<T> extends ATDParentList<T> {

	private LinkedList<T> list;
	private int cursor;

	private int head_status;
	private int tail_status;
	private int right_status;
	private int put_right_status;
	private int put_left_status;
	private int replace_status;
	private int remove_status;
	private int remove_all_status;
	private int find_status;

	public ParentList() {
		// TODO Auto-generated constructor stub
		list = new LinkedList<T>();
		this.cursor = -1;
		this.head_status = this.HEAD_NIL;
		this.tail_status = this.TAIL_NIL;
		this.right_status = this.RIGHT_NIL;
		this.put_right_status = this.PUT_RIGHT_NIL;
		this.put_left_status = this.PUT_LEFT_NIL;
		this.replace_status = this.REPLACE_NIL;
		this.remove_status = this.REMOVE_NIL;
		this.remove_status = this.REMOVE_ALL_NIL;
	}

	@Override
	public void head() {
		// TODO Auto-generated method stub
		if (this.list.size() != 0) {
			this.cursor = 0;
			this.head_status = this.HEAD_OK;
		} else {
			this.head_status = this.HEAD_ERR;
		}
	}

	@Override
	public void tail() {
		// TODO Auto-generated method stub
		if (this.list.size() != 0) {
			this.cursor = this.list.size() - 1;
			this.tail_status = this.TAIL_OK;
		} else {
			this.tail_status = this.TAIL_ERR;
		}
	}

	@Override
	public void right() {
		// TODO Auto-generated method stub
		if (this.cursor < this.list.size() - 1) {
			this.cursor++;
			this.right_status = this.RIGHT_OK;
		} else {
			this.right_status = this.RIGHT_ERR;
		}
	}

	@Override
	public void put_right(T value) {
		// TODO Auto-generated method stub
		if (this.cursor != -1) {
			this.list.add(this.cursor + 1, value);
			this.put_right_status = this.PUT_RIGHT_OK;
		} else {
			this.put_right_status = this.PUT_RIGHT_ERR;
		}
	}

	@Override
	public void put_left(T value) {
		// TODO Auto-generated method stub
		if (this.cursor != -1) {
			this.list.add(this.cursor - 1, value);
			this.put_left_status = this.PUT_LEFT_OK;
		} else {
			this.put_left_status = this.PUT_LEFT_ERR;
		}
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
		if (this.list.size() != 0 && this.cursor != -1) {
			this.list.remove(this.cursor);
			if (this.list.size() - 1 > this.cursor)
				this.cursor++;
			else if (this.list.size() >= 1)
				this.cursor--;
			else
				this.cursor = -1;
			this.remove_status = this.REMOVE_OK;
		} else {
			this.remove_status = this.REMOVE_NF;
		}
	}

	@Override
	public void replace(T value) {
		// TODO Auto-generated method stub
		if (this.list.size() != 0) {
			this.list.remove(this.cursor);
			if (this.list.size() - 2 > this.cursor)
				this.cursor++;
			if (this.list.size() >= 1)
				this.cursor--;
			else
				this.cursor = -1;
			this.remove_status = this.REMOVE_OK;
		} else {
			this.remove_status = this.REMOVE_NF;
		}
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		this.list.clear();
	}

	@Override
	public void add_tail(T value) {
		// TODO Auto-generated method stub
		list.add(value);
	}

	@Override
	public void remove_all(T value) {
		// TODO Auto-generated method stub
		int tmpCursor = 0;
		while(this.list.size() >= tmpCursor) {
			if(this.list.get(tmpCursor) == value) {
				this.list.remove(tmpCursor);
			}
		}
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return this.list.size();
	}

	@Override
	public void find(T value) {
		// TODO Auto-generated method stub
		if (this.list.size() != 0) {

			int tmpCursor = this.cursor;
			boolean isFind = false;

			while (tmpCursor < this.list.size()-1 && isFind == false) {
				tmpCursor++;
				if (value == this.list.get(tmpCursor))
					isFind = true;
			}

			if (isFind) {
				this.cursor = tmpCursor;
				this.find_status = this.FIND_OK;
			} else {
				this.find_status = this.FIND_NF;
			}
		} else {
			this.find_status = this.FIND_ERR;
		}
	}

	@Override
	public T get() {
		// TODO Auto-generated method stub
		return this.list.get(this.cursor);
	}

	@Override
	public boolean is_head() {
		// TODO Auto-generated method stub
		return this.cursor == 0;
	}

	@Override
	public boolean is_tail() {
		// TODO Auto-generated method stub
		return this.cursor == this.list.size() - 1;
	}

	@Override
	public boolean is_value() {
		// TODO Auto-generated method stub
		return this.cursor == -1;
	}

	@Override
	public int get_head_status() {
		// TODO Auto-generated method stub
		return this.head_status;
	}

	@Override
	public int get_tail_status() {
		// TODO Auto-generated method stub
		return this.tail_status;
	}

	@Override
	public int get_right_status() {
		// TODO Auto-generated method stub
		return this.right_status;
	}

	@Override
	public int get_put_left_status() {
		// TODO Auto-generated method stub
		return this.put_left_status;
	}

	@Override
	public int get_put_right_status() {
		// TODO Auto-generated method stub
		return this.put_right_status;
	}

	@Override
	public int get_replace_status() {
		// TODO Auto-generated method stub
		return this.replace_status;
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

}

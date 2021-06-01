package ParentList;

import java.util.LinkedList;
import java.util.List;

public class LinkedListMy<T> extends ParentList<T> {

	private List<T> list;
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

	
	public LinkedListMy() {
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
}

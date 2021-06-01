package ParentList;

import java.util.LinkedList;
import java.util.List;

public class TwoWayList<T> extends ParentList<T>{

	private int head_status;
	private int tail_status;
	private int right_status;
	private int left_status;
	private int put_right_status;
	private int put_left_status;
	private int add_tail_status;
	private int replace_status;
	private int remove_status;
	private int remove_all_status;
	private int find_status;
	
	private int cursor;
	
	private final int LEFT_NIL = 0;
	private final int LEFT_OK = 1;
	private final int LEFT_ERR = 2;

	private List<T> list;
	
	public TwoWayList() {
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

	} //post-condition: return origin of TwoWayList
	
	//pre-condition: cursor isset ( cursor != -1) and cursor > 0
	public void left() {
		// TODO Auto-generated method stub
		if (this.cursor > 0) {
			this.cursor--;
			this.left_status = this.LEFT_OK;
		} else {
			this.left_status = this.LEFT_ERR;
		}
	} //post-condition: cursor takes a new value
}

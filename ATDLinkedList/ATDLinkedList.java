package ATDLinkedList;

public abstract class ATDLinkedList<T> {
	
	//private 
	private int head_status;
	private int tail_status;
	private int right_status;
	private int put_right_status;
	private int puh_left_status;
	private int add_tail_status;
	private int replace_status;
	private int remove_status;
	private int remove_all_status;
	private int find_status;
	
	private int cursor;

	private ATDLinkedList<T> list;
	// Interface
	public final int HEAD_NIL = 0;
	public final int HEAD_OK = 1;
	public final int HEAD_ERR = 2;
	
	public final int TAIL_NIL = 0;
	public final int TAIL_OK = 1;
	public final int TAIL_ERR = 2;

	public final int RIGHT_NIL = 0;
	public final int RIGHT_OK = 1;
	public final int RIGHT_ERR = 2;
	
	public final int PUT_LEFT_NIL = 0;
	public final int PUT_LEFT_OK = 1;
	public final int PUT_LEFT_ERR = 2;
	
	public final int FIND_NF = -1;
	public final int FIND_NIL = 0;
	public final int FIND_OK = 1;
	public final int FIND_ERR = 2;
	
	
	public final int PUT_RIGHT_NIL = 0;
	public final int PUT_RIGHT_OK = 1;
	public final int PUT_RIGHT_ERR = 2;
	
	public final int REPLACE_NIL = 0;
	public final int REPLACE_OK = 1;
	public final int REPLACE_ERR = 2;
	
	public final int REMOVE_NF = -1; //NF - not found
	public final int REMOVE_NIL = 0;
	public final int REMOVE_OK = 1;
	public final int REMOVE_ERR = 2;
	
	public final int REMOVE_ALL_NF = -1; //NF - not found
	public final int REMOVE_ALL_NIL = 0;
	public final int REMOVE_ALL_OK = 1;
	public final int REMOVE_ALL_ERR = 2;
	
	
	//Creators:
	
	public ATDLinkedList() {
		// TODO Auto-generated constructor stub
	} //post-condition: return origin
	
	// Commands:
	
	// <pre>-condition: :LinkedList is not empty
	public abstract void head(); 	// post-condition: Set Cursor on the first element of LinkedList

	// <pre>-condition: :LinkedList is not empty
	public abstract void tail();// post-condition: Set Cursor on the first element of LinkedList

	// <pre>-condition: cursor is not tail
	public abstract void right(); // post-condition: cursor is a new value

	// <<pre>>-condition: LinkedList is not empty
	public abstract void put_right(T value);// post-condition: adding a new element right of the cursor

	// <pre>-condition: LinkedList is not empty
	public abstract void put_left(T value);// post-condition: adding a new element left of the cursor

	// <pre>-condition: LinkedList is not empty
	public abstract void remove();// remove cursor :: cursor is becoming his right neighbour, else right, if there are

	// <pre>-condition: LinkedList is not empty
	public abstract void replace(T value);// post-condition: cursor is a new element

	public abstract void clear();// post-condition: LinkedList is empty

	public abstract void add_tail(T value);// post-condition: LinkedList gets a new tail

	public abstract void remove_all(T value);// post-condition: LinkedList deletes all values with arg-value

	/////////////////////////////////////////////////////////////////////////////
	// Queries:

	public abstract int size();

	// <pre>-condition: LinkedList is not empty and there is element to find
	public abstract void find(T value);

	// <pre>-condition: LinkedList is not empty
	public abstract T get();

	public abstract boolean is_head();// is cursor head

	public abstract boolean is_tail(); // Is cursor tail

	public abstract boolean is_value();// Is cursor set?

	/////////////////////////////////////////////////////////////////////////////////
	// commands_status

	public abstract int get_head_status();

	public abstract int get_tail_status();

	public abstract int get_right_status();

	public abstract int get_put_left_status();
	
	public abstract int get_put_right_status();

	public abstract int get_replace_status();
	
	public abstract int get_find_status();
	
	public abstract int get_remove_status();
}

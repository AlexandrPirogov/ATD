package ATDStack;

import java.util.ArrayList;
import java.util.List;

public abstract class StackATD<T> {
	
	private List<T> stack;
	
	private int peek_status;
	private int pop_status;
	private int push_status;
	
	private int maxCount;
	
	//class interface
	public final int POP_NIL = 0;
	public final int POP_OK = 1;
	public final int POP_ERR = 2;
	
	public final int PEEK_NIL = 0;
	public final int PEEK_OK = 1;
	public final int PEEK_ERR = 2;
	
	public final int PUSH_NIL = 0;
	public final int PUSH_OK = 1;
	public final int PUSH_ERR = 2;
	
	
	//command
	//pre-condition: stack's size < max elements count
	public abstract void push(T value); 
	
	//command
	//pre-condition: stack is not empty
	public abstract T pop(); //post-condition: return last stack's element and remove it
	
	//query
	//pre-condition: stack is not empty
	public abstract T peek();
	
	//query
	//pre-condition: --- 
	public abstract int size();
	
	//command
	//pre-condition: ---
	public abstract void clear(); //post-condition: stack removes all elements
	
}

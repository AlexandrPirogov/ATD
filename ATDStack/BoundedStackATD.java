package ATDStack;

import java.util.ArrayList;
import java.util.List;

public class BoundedStackATD<T> extends StackATD<T>{
	
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
	
	
	public BoundedStackATD(){
		this.maxCount = 32;
		this.stack = new ArrayList<T>();
		this.push_status = this.PUSH_NIL;
		this.pop_status = this.POP_NIL;
		this.peek_status = this.PEEK_NIL;
	}
	
	//pre-condition: _maxCount must be integer
	public BoundedStackATD(int _maxCount){
		this.maxCount = _maxCount;
		this.stack = new ArrayList<T>();
		this.push_status = this.PUSH_NIL;
		this.pop_status = this.POP_NIL;
		this.peek_status = this.PEEK_NIL;
	}
	
	//command
	//pre-condition: stack's size < max elements count
	public  void push(T value) {
		if(this.size() < this.maxCount) {
			this.stack.add(value);
			this.push_status = this.PUSH_OK;
		} else {
			this.push_status = this.PEEK_ERR;
		}
	}
	
	//command
	//pre-condition: stack is not empty
	public  T pop() {
		T result;
		if(this.size() > 0) {
			result = this.stack.get(this.size()-1);
			this.stack.remove(this.size()-1);
			this.pop_status = this.POP_OK;
		} else {
			this.pop_status = this.POP_ERR;
			result = null; //bad practice
		}
		return result;
	} //post-condition: return last stack's element and remove it
	
	//query
	//pre-condition: stack is not empty
	public  T peek() {
		T result;
		if(this.size() > 0) {
			result = this.stack.get(this.size()-1);
			this.peek_status = this.PEEK_OK;
		} else {
			this.peek_status = this.PEEK_ERR;
			result = null; //bad practice
		}
		return result;
	} 
	
	//query
	//pre-condition: --- 
	public  int size() {
		return this.stack.size();
	}
	
	//command
	//pre-condition: ---
	public  void clear() {
		this.stack.clear();
		this.peek_status = 0;
		this.push_status = 0;
		this.pop_status = 0;
	} //post-condition: stack removes all elements
	
	public int get_push_status() {
		return this.push_status;
	}
	
	public int get_peek_status() {
		return this.peek_status;
	}
	
	public int get_pop_status() {
		return this.pop_status;
	}
}

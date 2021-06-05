package ATDQueueIS;

import java.util.LinkedList;

public class MyTwoWayQueue<T> extends ATDParentQueue<T>{

	private LinkedList<T> list;
	
	private int enqueue_status;
	private int dequeue_status;
	private int remove_status;
	private int add_head_status;
	private int dequeue_head_status;
	private int find_status;
	
	public final int ADD_HEAD_NIL = 0;
	public final int ADD_HEAD_ERR = 1;
	public final int ADD_HEAD_OK = 2;
	
	public final int DEQUEUE_TAIL_NIL = 0;
	public final int DEQUEUE_TAIL_ERR = 1;
	public final int DEQUEUE_TAIL_OK = 2;
	
	
	
	private int size;
	public MyTwoWayQueue() {
		// TODO Auto-generated constructor stub
		list = new LinkedList<T>();
		size = 0;
		this.enqueue_status = 0;
		this.dequeue_status = 0;
		this.remove_status = 0;
		this.find_status = 0;
	}//post;condition: new queue
	
	@Override
	public void enqueue(T item) {
		// TODO Auto-generated method stub
		this.list.add(item);
		this.enqueue_status = this.ENQUEUE_OK;
	}

	@Override
	public void dequeue(T item) {
		// TODO Auto-generated method stub
		if(this.list.size() > 0) {
			this.dequeue_status = this.DEQUEUE_OK;
			this.list.removeFirst();
		} else
			this.dequeue_status = this.DEQUEUE_ERR;
	}
	
	public void addHead(T item) {
		this.list.addLast(item);
		this.add_head_status = this.ADD_HEAD_OK;
	}
	
	public void dequeueTail() {
		if(this.list.size() > 0) {
			this.dequeue_status = this.DEQUEUE_OK;
			this.list.removeLast();
		} else
			this.dequeue_status = this.DEQUEUE_ERR;
	}

	@Override
	public T find(T item) {
		// TODO Auto-generated method stub
		if(this.list.size() > 0) {
			int index = this.list.indexOf(item);
			if(index != -1){
				this.find_status = this.FIND_OK;
				return this.list.get(index);
			}
		}
		this.find_status = this.FIND_ERR;
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return this.list.size();
	}

	@Override
	public int get_enqueue_status() {
		// TODO Auto-generated method stub
		return this.enqueue_status;
	}

	@Override
	public int get_dequeue_status() {
		// TODO Auto-generated method stub
		return this.dequeue_status;
	}

	@Override
	public int get_remove_status() {
		// TODO Auto-generated method stub
		return this.remove_status;
	}

	@Override
	public int get_find_status() {
		// TODO Auto-generated method stub
		return this.find_status;
	}
	
	public int get_add_tail_status() {
		return this.add_head_status;
	}
	
	public int get_dequeue_head_status() {
		return this.dequeue_head_status;
	}
}

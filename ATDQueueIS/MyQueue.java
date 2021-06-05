package ATDQueueIS;

import java.util.LinkedList;

public class MyQueue<T> extends ATDParentQueue<T> {

	private LinkedList<T> list;
	
	private int enqueue_status;
	private int dequeue_status;
	private int remove_status;
	private int find_status;
	
	private int size;
	public MyQueue() {
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

}

package ATDQueue;

public abstract class ATDQueue<T> {

	public final int ENQUEUE_NIL = 0;
	public final int ENQUEUE_ERR = 1;
	public final int ENQUEUE_OK = 2;
	
	public final int DEQUEUE_NIL = 0;
	public final int DEQUEUE_ERR = 1;
	public final int DEQUEUE_OK = 2;
	
	public final int REMOVE_NIL = 0;
	public final int REMOVE_ERR = 1;
	public final int REMOVE_OK = 2;
	
	public final int FIND_NIL = 0;
	public final int FIND_ERR = 1;
	public final int FIND_OK = 2;

	public ATDQueue() {
		// TODO Auto-generated constructor stub
	}
	
	//commands
	
	public abstract void enqueue(T item); //post-condition: добавили предмет в очередь
	
	//pre-codition: queue is not empty
	public abstract void dequeue(T item);//post-codition: удалили предмет из очереди
	
	//pre-condition: queue is not empty and contain item
	public abstract void remove(T item); //post-condition: removed item from queue
	
	//queries
	//pre-condition: item in queue
	public abstract T find(T item); 
	
	//pre-condition: queue is exists
	public abstract int size(); //post-condition: returns size of queue
	
	//statuses
	
	public abstract int get_enqueue_status();  //returns last status
	
	public abstract int get_dequeue_status();//returns last status
	
	public abstract int get_remove_status();//returns last status
	
	public abstract int get_find_status();
}

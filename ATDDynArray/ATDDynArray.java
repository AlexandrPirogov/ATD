package ATDDynArray;

public abstract class ATDDynArray<T> {

	
	//statuses
	private int set_status;
	private int remove_status;
	private int capacity;
	private int count;
	
	// commands statuses
	public final int SET_NIL = 0;
	public final int SET_OK = 1;
	public final int SET_ERR = 2;

	public final int REMOVE_NIL = 0;
	public final int REMOVE_OK = 1;
	public final int REMOVE_ERR = 2;

	private int[] myArr;
	// creators

	// commands
	public abstract void add(T item, int in);

	public abstract void remove(int index);

	// queries
	public abstract int count();

	public abstract int capacity();

	public abstract T getItem(int index);

	public abstract int getIndex(T item);
	
	//commands status managment methods
	
	public abstract int get_add_status();
	
	public abstract int get_remove_status();
}

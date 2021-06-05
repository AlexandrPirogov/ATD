package ATDHashTable;

public abstract class ATDHashTable<T> {

	public final int PUT_NIL = 0;
	public final int PUT_ERR = 1;
	public final int PUT_OK = 2;

	public final int GET_NIL = 0;
	public final int GET_ERR = 1;
	public final int GET_OK = 2;
	
	//creators
	public ATDHashTable() {
		// TODO Auto-generated constructor stub
	} //создаём новую хэш-таблицу
	
	//commands
	public abstract void put(T value);//post-condition: added a new value to a hash-table
	
	//query
	public abstract int get(T value);//post-condition: returns id of value
}

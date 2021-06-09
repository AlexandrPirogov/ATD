package ATDPowerSet;

import ATDHashTable.ATDHashTable;

public abstract class ADTPowerSet <T> extends ATDHashTable<T> {
	
	public final int REMOVE_NIL = 0;
	public final int REMOVE_OK = 1;
	public final int REMOVE_ERR = 2;
	
	//commands
	//pre-condition: значение имеется в массиве
	public abstract void remove(T value);//post-condition: значение удалено из массива
	
	//query
	//pre-condition: значение имеется в массиве
	public abstract boolean isExists(T value); //post-conditoin: если массив имеется в массиве
	//возвращается true; false
	
	public abstract int size();
	
	
	//commands_status_query
	public abstract int get_put_status();
	
	public abstract int get_remove_status();
	
}

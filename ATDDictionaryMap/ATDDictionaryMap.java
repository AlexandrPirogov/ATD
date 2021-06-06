package ATDDictionaryMap;

public abstract class ATDDictionaryMap<T> {
	
	public final int INSERT_NIL = 0;
	public final int INSERT_OK = 1;
	public final int INSERT_ERR = 2;
	
	public final int REMOVE_NIL = 0;
	public final int REMOVE_OK = 1;
	public final int REMOVE_ERR = 2;
	
	//creators
	public ATDDictionaryMap() {
		// TODO Auto-generated constructor stub
	}//returns new Dicrionary Map
	
	//commands
	//pre-condition: Dictionary is not null 
	public abstract void insert(String key, T value);// post-condition: Добавлен элемент в Словарь
	
	//pre-condition: Элемент находится в массиве
	public abstract void remove(T value); //post-condition: Элемент удалён из словаря
	
	//queries
	
	//pre-condition: key is exists.
	public abstract T get(String key); //post-condition: returns value of key; error

	//pre-condition: value is exists
	public abstract String find(T value); //post-condition: reutnrs key; error
	
	
	//queries_status
	
	public abstract int get_get_status();
	
	public abstract int get_find_status();
	
	public abstract int get_remove_status();
	
	public abstract int get_insert_status();
}

package ADTBloomeFilter;

public abstract class ADTBloomeFilter<T> {
	
	public ADTBloomeFilter(int size) {
	}//post-condition: новый объект filterBloome
	
   //commands
	public abstract void put(T value); //post-condition: хэшированное значение добавлено в фильтр Блюма
	
	//queries
	public abstract boolean get(T value); //Возвращает true, но предмет может отутствовать; возвращает 
	//false если значение точно отсутствует
}

package src.com.codewithmosh.generics;
/**
 * here our class can have parameters, and T extends numbers will only store numbers
 * We can also extend interfaces like comparable n others
 */
public class GenericList<T extends Number> {
    private T[] items = (T[])new Object[10];
    private int count;

    public void add(T item){
        items[count++] = item;
    }

    public T get(int index){
        return items[index];
    }
}

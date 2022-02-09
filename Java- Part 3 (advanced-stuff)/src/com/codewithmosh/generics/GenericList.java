package src.com.codewithmosh.generics;

// here our class can have parameters, and T can be anything
public class GenericList<T> {
    // we casting it to T array as we don't know type it will hold
    private T[] items = (T[])new Object[10];
    private int count;

    public void add(T item){
        items[count++] = item;
    }

    public T get(int index){
        return items[index];
    }
}

package src.com.codewithmosh.generics;

import java.util.Iterator;
import java.util.ListIterator;

public class GenericList<T> implements Iterable<T> {

  private T[] items = (T[]) new Object[10];
  private int count;

  public void add(T item) {
    items[count++] = item;
  }

  public T get(int index) {
    return items[index];
  }


  @Override
  public Iterator<T> iterator() {
    return null;
  }
}

}

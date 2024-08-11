package org.digitnary.traning.EnumerationIterator;

public interface Enumeration<T> {
    boolean hasMoreElements();
    T nextElement();

    default Iterator<T> asIterator() {
      return new Iterator<T>() {
          @Override
          public boolean hasNext(){
              return hasMoreElements();
          }
          @Override
          public T next(){
              return nextElement();
          }

      };
    }

}

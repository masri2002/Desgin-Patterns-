package org.digitnary.traning.EnumerationIterator;

public class EnumerationIterator<T> implements Iterator<T>{
    Enumeration e;

    public EnumerationIterator(Enumeration e) {
        this.e = e;
    }

    @Override
    public boolean hasNext() {
        return e.hasMoreElements();
    }

    @Override
    public T next() {
       return (T)e.nextElement();
    }

}

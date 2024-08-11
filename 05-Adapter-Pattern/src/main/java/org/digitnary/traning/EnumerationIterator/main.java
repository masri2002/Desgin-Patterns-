package org.digitnary.traning.EnumerationIterator;

public class main {
    public static void main(String[] args) {
        StringTokenizerIteratorAdapter adapter = new StringTokenizerIteratorAdapter("ahmad ali mohammed almasri");
        while (adapter.hasNext()) {
            System.out.println(adapter.next());
        }
    }
}

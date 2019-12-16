import java.util.Collection;

public class SimpleLinkedList<E> {

    private class Node<E> {
        E item;
        Node<E> next;

        Node(E element,Node<E> next) {
            this.item = element;
            this.next = next;
        }
    }

    int size = 0;

    Node<E> head;

    public SimpleLinkedList(){
    }

    public SimpleLinkedList(Collection<? extends E> c){
        this();
        addAll(c);
    }

    Node<E> node(int index) {
        Node<E> x = head;
        for ( int i = 0; i < index; i++ ) {
            x = x.next;
        }
        return x;
    }

    void linkAfter(E e,Node<E> pred) {

    }

    void linkLast(E e) {

    }

    public void add(E element) {

    }

    public void add(int index,E element) {

    }

    public void addFirst(E e) {

    }

    public E get(int index) {

    }

    public int indexOf(Object o) {

    }

    E unlink(Node<E> x) {

    }

    public boolean remove() {

    }

    public E remove(int index) {

    }
}
package gr.aueb.cf.ch17.singly_linked_list;

public class Node<T> {
    private T item;
    private Node<T> next;    // δείκτης προς το επόμενο node

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
}

package Structures;

public class SinglyLinkedList<E> {

    //-------Nested Node Class-----
    private static class Node<E> {
        private E element;
        private Node<E> next;                        // reference to the element stored at this node
        public Node(E e, Node<E> n) {                // reference to the subsequent node in the list
            element = e;
            next = n;
        }
        public E getElement( ) { return element; }
        public Node<E> getNext( ) { return next; }
        public void setNext(Node<E> n) { next = n; }
    }//End Class Node

    private Node<E> head=null;         // head node of the list (or null if empty)
    private Node<E> tail=null;         // last node of the list (or null if empty)
    private int size=0;                // number of nodes in the list

    public SinglyLinkedList(){}        // constructs an initially empty list

    //Access Methods

    public int getSize(){return size;}

    public boolean isEmpty(){return size==0;}

    public E First(){
        if (isEmpty())                // returns (but does not remove) the first element
            return null;
        return head.getElement();
    }

    public E last(){
        if (isEmpty())                // returns (but does not remove) the last element
            return null;
        return tail.getElement();
    }

    // update methods
    public void AddFirst(E e){
        head=new Node<>(e,head);
        if (size==0)
            tail=head;
        size++;
    }

    public void AddLast(E e){
        Node<E> newest=new Node<>(e,null);
        if (isEmpty())
            head=newest;
        else
            tail.setNext(newest);
        tail=newest;
        size++;
    }

    public E removeFirst( ) {
        if (isEmpty( )) return null;
        E answer = head.getElement( );
        head = head.getNext( );
        size--;
        if (size == 0)
        tail = null;
        return answer;

    }


}

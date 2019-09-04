package linkedList;

public class MyLinkedList<E> {

    private Node<E> head = null;
    private int numNodes;

    public MyLinkedList() {
    }

    private class Node<E> {
        private Node next;
        private E data;

        public Node(E data) {
            this.data = data;
        }

        public E getData() {
            return this.data;
        }
    }

    private void checkIndex(int index) {
        if (index < 0 || index > numNodes) {
            throw new IndexOutOfBoundsException("Index out of bound");
        }
    }

    public void add(int index, E e) {
        Node<E> current = head;
        Node<E> temp;

        for (int i = 0; i < index - 1 && current.next != null; i++) {
            current = current.next;
        }

        temp = current.next;
        current.next = new Node(e);
        current.next.next = temp;
        numNodes++;
    }

    public void addFirst(E e) {
        Node current = head;
        head = new Node<E>(e);
        head.next = current;
        numNodes++;
    }

    public void addLast(E e) {
        Node current = head;
        for (int i = 0; i < numNodes && current.next != null; i++) {
            current = current.next;
        }
        numNodes++;
        current.next = new Node(e);

    }

    public int size() {
        return numNodes;
    }

    public E remove(int index) {
        checkIndex(index);
        Node<E> previous = head;
        for (int i = 0; i < index - 1; i++) {
            previous = previous.next;
        }

        Node<E> current = previous.next;
        previous.next = current.next;
        numNodes--;
        return current.data;
    }

    public boolean remove(E e) {
        Node current = head;
        for (int i = 0; i < numNodes - 1 && current.next != null; i++) {
            if (e.equals(current.data)) {
                for (int j = i; j < numNodes - 1 && current.next != null; j++) {
                    current.data = current.next.data;
                    current = current.next;
                }
                numNodes--;
                return true;
            } else {
                current = current.next;
            }
        }
        return false;
    }

    public E get(int i) {
        Node<E> current = head;
        for (int j = 0; j < i; j++) {
            current = current.next;
        }
        return current.data;
    }

    public boolean contain (E o){
        Node<E> current = head;

        for(int i = 0; i < numNodes-1 && current.next != null; i++){
            if(o.equals(current.data)){
                return true;
            }
        }
        return false;
    }

    public E getFirst(){
        return head.data;
    }

    public E getLast(){
        Node<E>current = head;
        for(int i = 0; i < numNodes-1 && current.next != null; i++){
            current = current.next;
        }
        return current.data;
    }

    public void printList(){
        Node current = head;
        while (current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }

    public int indexOf(E e){
        Node<E>current = head;
        int position = -1;
        for(int i = 0; i < numNodes-1 && current.next != null; i++){
            current = current.next;
            if(e.equals(current.data)){
                position = i;
                return position;
            }
        }
        return position;
    }

    public MyLinkedList<E> clone() {
        MyLinkedList<E> list = new MyLinkedList<E>();
        return list;
    }
}

package simpleLinkedList;

public class MyLinkedListTest {
    public static void main (String[] args){
        MyLinkedList list = new MyLinkedList(10);
        list.add(3,4);
        list.addFirst(11);
        list.printList();
    }
}

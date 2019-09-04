package linkedList;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<String>();



        list.addFirst("1");
        list.addFirst("2");
        list.addFirst("3");
        list.addFirst("4");
        list.addFirst("6");
        list.addLast("7");

        list.remove("3");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }


}

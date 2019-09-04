package simpleList;

public class MyListTest {
    public static void main (String[] args){
        MyList<Integer> list = new MyList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list.get(3));
        System.out.println(list.get(2));

        MyList<String> listString = new MyList<String>();
        listString.add("first");
        listString.add("second");
        listString.add("third");
        listString.add("fourth");
        listString.add("fifth");

        System.out.println(listString.get(1));


    }
}

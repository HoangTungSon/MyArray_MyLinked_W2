package arrayList;

public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList<Integer> myArrayList = new MyArrayList<Integer>(5);

        System.out.println(myArrayList.size());
        myArrayList.add(1);
        for (int i = 0; i < myArrayList.size(); i++) {
            System.out.println(myArrayList.get(i));
        }
        System.out.println(myArrayList.size());

    }
}

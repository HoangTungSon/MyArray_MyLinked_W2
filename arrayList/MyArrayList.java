package arrayList;

import linkedList.MyLinkedList;

import java.util.Arrays;

public class MyArrayList<E> {
    private int size = 0;
    private static int DEFAULT_CAPACITY = 10;
    private E[] elements;

    public MyArrayList() {
        elements = (E[]) new Object[DEFAULT_CAPACITY];
    }

    public MyArrayList(int capacity) {
        size = capacity;
        elements = (E[]) new Object[size];
    }

    private void ensureCapacity(int minCapacity) {
        elements = Arrays.copyOf(elements, minCapacity);
    }

    private void checkIndex(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index out of bound");
        }
    }

    public void add(int index, E element) {
        for (int i = elements.length - 1; i > index; i--) {
            elements[i] = elements[i - 1];
        }
        elements[index] = element;
        size++;
    }

    public E remove(int index) {
        checkIndex(index);

        E e = elements[index];

        for (int i = index; i < elements.length - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[elements.length - 1] = null;
        size--;
        return e;
    }

    public int size() {
        return size;
    }

    public MyArrayList<E> clone() {
        MyArrayList<E> list = new MyArrayList<E>();
        return list;
    }

    public boolean contain(E o) {
        for (int i = 0; i < size - 1; i++) {
            if (o.equals(elements[i])) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(E o) {
        for (int i = size - 1; i > 0; i--) {
            if (o.equals(elements[i])) {
                return i;
            }
        }
        return -1;
    }

    public void add(E e) {
        size = size + 1;
        elements = Arrays.copyOf(elements, size);
        elements[size-1] = e;
    }

    public E get(int i) {
        checkIndex(i);
        return elements[i];
    }

    public void clear() {
        elements = (E[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }
}

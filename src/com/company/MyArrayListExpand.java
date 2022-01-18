package com.company;

import java.util.Arrays;

public class MyArrayListExpand<T> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements; /*Kiểu generic không cho khai báo một mảng nên không đưa Object về generic được*/

    public MyArrayListExpand() {
        this.elements = new Object[DEFAULT_CAPACITY];
    }


    public int size() {
        return this.size;
    }

    public T get(int index) {
        if (index < 0 || index > this.size) {
            throw new ArrayIndexOutOfBoundsException("Index: " + index + ", size + " + this.size);
        }
        return (T) this.elements[index];
    }

    public void add(T t) {         /*T là KDL, còn t là tên biến*/
        if (elements.length == size) {
            int newCapacity = this.elements.length * 2;
            this.elements = Arrays.copyOf(this.elements, newCapacity);
        }
        this.elements[this.size] = t;
        size++;
    }

    public void add(int index, T t) {
        if (index < 0 || index > size) {
            throw new ArrayIndexOutOfBoundsException("Index: " + index + ", size + " + this.size);
        }
        if (elements.length == size) {
            int newCapacity = this.elements.length * 2;
            this.elements = Arrays.copyOf(this.elements, newCapacity);
        }
        for (int i = index + 1; i <= this.size; i++) {
            this.elements[i] = this.elements[i - 1];
        }
        this.elements[index] = t;
        this.size++;
    }

    public void remove(int index){
        if (index < 0 || index > size) {
            throw new ArrayIndexOutOfBoundsException("Index: " + index + ", size + " + this.size);
        }
        for (int i = index; i < this.size; i++) {
            this.elements[i] = this.elements[i+1];
        }
        this.size--;
    }
}

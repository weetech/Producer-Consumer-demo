package com.company;
import java.util.LinkedList;
import java.util.Queue;

public class Collection<T> {
    private Queue<T> collection = new LinkedList<T>();
    private int capacity;

    public Collection(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getSize() {
        return this.collection.size();
    }

    public boolean add(T image) {
        this.collection.add(image);
        return true;
    }

    public T popFirstImage() {
        return this.collection.remove();
    }
}

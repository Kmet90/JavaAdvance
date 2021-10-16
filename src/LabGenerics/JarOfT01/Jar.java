package LabGenerics.JarOfT01;

import java.util.ArrayDeque;

public class Jar<T> {
    private ArrayDeque<T> value;

    public Jar() {
        this.value = new ArrayDeque<>();
    }

    public void add(T element) {
        this.value.push(element);
    }

    public T remove() {
        return this.value.pop();
    }
}

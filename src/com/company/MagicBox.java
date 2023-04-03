package com.company;

import java.util.Random;

public class MagicBox<T> {

    private Object[] arr;

    public MagicBox(int col) {
        arr = (T[]) new Object[col];
    }


    public boolean add(T item) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                arr[i] = item;
                return true;
            }
        }
        return false;
    }

    public T pick() {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                throw new RuntimeException("Коробка не полна. Oсталось заполнить " + (arr.length - i) + " ячеек");
            }
        }
        Random random = new Random();
        int randomInt = random.nextInt(arr.length); // джава подберёт случайное число от 0 до ЧИСЛО невключительно
        return (T) arr[randomInt];
    }

}

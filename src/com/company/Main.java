package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(4);
        arrayList.add(7);

    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static boolean checkIsEmpty(ArrayList<Integer> arrayList) {
        boolean empty = false;
        if (arrayList.isEmpty()) {
            empty = true;
        }
        return empty;
    }
}

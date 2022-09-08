package com.company;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        Set<Integer> set2 = new HashSet<>();
        set2.add(0);
        set2.add(1);
        set2.add(2);

        System.out.println(symmetricDifference(set1, set2));
    }

    public static Set<Integer> symmetricDifference(Set<Integer> set1, Set<Integer> set2){
        Set<Integer> newSet = new HashSet<>(set1);
        newSet.addAll(set2);
        Set<Integer> temp = new HashSet<>(set1);
        temp.retainAll(set2);
        newSet.removeAll(temp);
        return newSet;
    }
}

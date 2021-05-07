package com.company;

import java.util.Set;
import java.util.HashSet;

class Main {

    public static void main(String[] args) {
        // HashSet sınıfını kullanarak bir küme oluşturma
        Set<Integer> set1 = new HashSet<>();

        //Set1'e elemanlar ekle
        set1.add(2);
        set1.add(3);
        System.out.println("Set1: " + set1);

        // HashSet sınıfını kullanarak başka bir küme oluşturma
        Set<Integer> set2 = new HashSet<>();

        //eleman ekle
        set2.add(1);
        set2.add(2);
        System.out.println("Set2: " + set2);

        // İki setin birliği
        set2.addAll(set1);
        System.out.println("Birleştirme: " + set2);
    }
}

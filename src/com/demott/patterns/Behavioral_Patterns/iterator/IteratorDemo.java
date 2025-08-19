package com.demott.patterns.Behavioral_Patterns.iterator;

import java.util.Iterator;
import java.util.List;
import java.util.Arrays;

public class IteratorDemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        Iterator<String> it = names.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

package com.example;

import java.util.Map;
import java.util.*;
import java.util.stream.Collectors;

public class Stream {
    static ArrayList<String> createStringArrayList() {
        /*The "<>" diamond operator – introduced in Java 1.7
        adds type inference and reduces the verbosity in the assignments – when using generics */
        ArrayList<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");
        list.add("Six");
        list.add("Seven");
        list.add("Eight");
        list.add("Nine");
        list.add("Ten");
        return list;
    }

    static HashMap<String, Integer> createMap() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Barsic", 1);
        map.put("David", 3);
        map.put("Vas`ka", 5);
        return map;
    }

    static Set<Integer> createIntegerArrayList() {
        Set<Integer> set = new HashSet<>();
        set.add(8);
        set.add(2);
        set.add(4);
        set.add(10);
        set.add(6);
        set.add(0);
        set.add(22);
        set.add(12);
        return set;
    }

    public static void main(String[] args) {
        createStringArrayList().stream()                      //conversion to stream
                .filter(x -> x.length() == 3)                 //the filter() method is an intermediate operation of the Stream interface that allows us to filter elements of a stream that match a given Predicate: in our case all elements with string length = 3
                .sorted((e1, e2) -> e2.compareTo(e1))         //sorting alphabetically descending
                .map((m) -> "number " + m)                    //converts each list item in our case for each item adds string: "number"
                .skip(1)                                      //this method skips 1 first element
                .limit(2)                                     //this method skips all elements after second
                .forEach(System.out::println);                //this method prints stream in console

        createStringArrayList().stream()
                .sorted(Comparator.comparing(String::length)
                        .reversed())
                .forEach(System.out::println);

        //min return minimal number from list
        Optional<Integer> min = createIntegerArrayList().stream()
                .min(Comparator.naturalOrder());

        //allMatch chek if all elements on list are even
        boolean ifAllNumbersEven = createIntegerArrayList().stream().allMatch(e -> e % 2 == 0);

        //anyMatch chek if any elements contains element with contains string One
        boolean ifListContainsNumberOne = createStringArrayList().stream().anyMatch(e -> e.contains("One"));
        System.out.println(ifListContainsNumberOne);
        System.out.println(ifAllNumbersEven);


        int count = createIntegerArrayList().stream()
                .reduce(Integer::sum)
                .orElse(-1);            //if list does not have any elements returns -1

        System.out.println(min);
        createIntegerArrayList().forEach(System.out::println);

        //returns key by value
        createMap().entrySet()
                .stream()
                .filter(entry -> Objects.equals(entry.getValue(), 1))
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet()).forEach(System.out::println);
    }
}

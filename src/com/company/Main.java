package com.company;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        Function function = new Function() {
            @Override
            public Object apply(Object o) {
                return null;
            }
        };
        System.out.println(function.getClass());
    }
}


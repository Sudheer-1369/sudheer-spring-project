package com.sudheer.functionalinterfaces.existing;

import java.util.function.BiFunction;

public class IBiFunction {

    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> biFunction = (a,b)-> a*b;

        System.out.println(biFunction.andThen(a-> "sudheer"+a).apply(2,3));
    }
}

package com.sudheer.functionalinterfaces.existing;

import java.util.function.Function;

public class IFunction {
    public static void main(String[] args) {
        Function<Integer, Integer> f1 = a -> a*2;

        // apply -- applies the given function on the argument
        System.out.println(f1.apply(3));

        // andThen --  applied f1 and the takes the input of first function as input of second function and return any type of output.
        System.out.println(f1.andThen(a-> "sudheer"+a).apply(3));

        // Compose --  applies the method in compose first and then the others

        Function<String, String> f2 = a->"Mounika "+a;
        System.out.println(f2.compose(b->"loves sudheer").apply(10));

        // Identity --  returns the argument that is passed
        Function<Integer, Integer> f3 = Function.identity();
        System.out.println(f3.apply(10));

    }
}

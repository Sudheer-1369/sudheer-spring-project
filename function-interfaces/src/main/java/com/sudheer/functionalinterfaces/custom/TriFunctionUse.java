package com.sudheer.functionalinterfaces.custom;

public class TriFunctionUse {

    public static void main(String[] args) {

        TriFunction<Integer, Integer, Integer, String> triFunction = (a,b,c)-> "Sudheer version "+a*b*c;
        System.out.println(triFunction.apply(1,2,3));

        System.out.println(triFunction.andThen(a->a+" also loves Mounika Bhogi").apply(1,2,3));

    }
}

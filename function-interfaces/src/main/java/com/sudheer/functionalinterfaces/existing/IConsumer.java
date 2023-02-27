package com.sudheer.functionalinterfaces.existing;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class IConsumer {
    public static void main(String[] args) {
        Consumer<List<Integer>> modify = a ->{
            for(int i=0;i<a.size();i++){
                a.set(i,2*a.get(i));
            }
        };

        List<Integer> list = new ArrayList<>(List.of(10,20,30,40));

        modify.andThen(b-> {
            for(Integer i:b)
                System.out.print(i+"---");
        }).accept(list);

    }
}

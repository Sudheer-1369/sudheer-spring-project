package com.sudheer.functionalinterfaces.existing;

import java.util.function.Supplier;

public class ISupplier {
    public static void main(String[] args) {

        print(()-> "her son");
        print(()-> "her daughter");
        print(()-> "son-in-law and daughter-in-law");
    }

    static void print(Supplier<String> supplier){
        System.out.println("Every mom loves "+supplier.get());
    }
}

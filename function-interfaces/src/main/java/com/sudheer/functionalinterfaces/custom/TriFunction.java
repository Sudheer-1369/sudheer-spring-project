package com.sudheer.functionalinterfaces.custom;

import java.util.Objects;
import java.util.function.Function;

@FunctionalInterface
public interface TriFunction<T, U, V, R> {

    R apply(T t, U u, V v);

    default <A> TriFunction<T, U, V, A> andThen(Function<? super R, ? extends A> after){
        Objects.requireNonNull(after);
        return (t,u,v)-> after.apply(apply(t,u,v));
    }
}

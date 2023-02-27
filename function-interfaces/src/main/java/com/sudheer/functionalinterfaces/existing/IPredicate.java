package com.sudheer.functionalinterfaces.existing;

import com.sudheer.functionalinterfaces.support.User;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class IPredicate {

    private static final String ARCHITECT = "ARCHITECT";
    private static final String SDE = "SDE5";

    public static void main(String[] args) {
        Predicate<Integer> p1 = i-> i>10;
        System.out.println(p1.test(22));
        System.out.println(p1.test(5));

        Predicate<Integer> p2= i->i<25;

        Predicate<Integer> p3= p1.and(p2);
        System.out.println(p3.test(11));

        Predicate<Integer> p4 = p1.or(p2);
        System.out.println(p4.negate().test(5));

        // Predicates in collections

        List<User> list = new ArrayList<>();
        list.add(User.builder().name("Sudheer").role(ARCHITECT).build());
        list.add(User.builder().name("Cyril").role(ARCHITECT).build());
        list.add(User.builder().name("Srini").role(SDE).build());

        List<User> result = filterArchitects(list, u->u.getRole().equals(ARCHITECT));

        for(User u: result)
            System.out.println(u.getName()+"  "+u.getRole());
    }

    static List<User> filterArchitects(List<User> users, Predicate<User> predicate){
        List<User> result = new ArrayList<>();
        for(User u: users){
            if(predicate.test(u)){
                result.add(u);
            }
        }
        return result;
    }
}

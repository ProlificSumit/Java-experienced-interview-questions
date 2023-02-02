package com.learn.java8.methodreference;


import files.Person;

import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorReferenceTest {

    static Supplier<Person> personSupplier = Person::new;
    static Function<String, Person> personFunction = Person::new;

    public static void main(String[] args) {
        System.out.println(personSupplier.get());
        System.out.println(personFunction.apply("John"));
    }
}

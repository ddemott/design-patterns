package com.demott.patterns.Creational_Patterns.builder;

/**
 * Builder Pattern Example.
 * <p>
 * Intent: Separate the construction of a complex object from its representation so that the same construction process can create different representations.
 * </p>
 * Usage: Person p = new Person.Builder().setFirstName("John").setLastName("Doe").setAge(30).build();
 */
public class Person {
    private final String firstName;
    private final String lastName;
    private final int age;

    private Person(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
    }

    /**
     * Builder for Person.
     */
    public static class Builder {
        private String firstName;
        private String lastName;
        private int age;

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public Builder setAge(int age) {
            this.age = age;
            return this;
        }
        public Person build() {
            return new Person(this);
        }
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + ", age " + age;
    }
}

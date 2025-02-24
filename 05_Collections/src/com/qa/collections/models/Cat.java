package com.qa.collections.models;

import java.util.Objects;

// new type called 'Cat'
public class Cat extends Pet {

    private boolean indoor;
    public static String latinName = "Felis Catus";

    public Cat() {
        super(); // basically calling new Pet()
        // default
    }

    public Cat(boolean indoor) {
        super();
        this.indoor = indoor;
    }

    public Cat(String name, int age, String colour) {
        super(name, age, colour); // basically calling new Pet(name, age, colour)
//        this.setName(name);
//        this.setAge(age);
//        this.setColour(colour);
    }

    public Cat(String name, int age, String colour, boolean indoor) {
        super(name, age, colour);
        this.indoor = indoor;
    }

    public boolean isIndoor() {
        return indoor;
    }

    public void setIndoor(boolean indoor) {
        this.indoor = indoor;
    }

    @Override
    public String makeNoise() {
        return "MEOW";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return indoor == cat.indoor;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), getColour(), indoor);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", colour='" + getColour() + '\'' +
                ", indoor='" + isIndoor() + '\'' +
                '}';
    }
}

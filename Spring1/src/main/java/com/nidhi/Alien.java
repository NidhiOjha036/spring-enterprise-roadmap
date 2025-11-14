package com.nidhi;

public class Alien {

    int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("setter called");
        this.age = age;
    }

    public Alien()
    {
        System.out.println("Object Created");
    }

    public void code()
    {
        System.out.println("Coding");
    }
}

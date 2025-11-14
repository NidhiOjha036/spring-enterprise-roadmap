package com.nidhi;

public class Alien {

    int age;
   // private int salary;
    private Computer com;

    public Alien()
    {
        //System.out.println("Object Created");
    }

//    public Alien(int age, Computer com)
//    {
//        System.out.println("Para constructor called");
//        this.age = age;
//        this.com = com;
//    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public void code()
    {
        System.out.println("Coding");
        com.compile();
    }

}

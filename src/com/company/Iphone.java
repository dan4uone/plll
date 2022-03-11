package com.company;

public class Iphone extends Phone{
    private String apps;

    public Iphone(String name, String apps) {
        super(name);
        this.apps = apps;
    }

    @Override
    public void print() {
        System.out.println("Phone: " + "Iphone" + "\nIphone annexes: " + apps);
    }
}
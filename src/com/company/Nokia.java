package com.company;

public class Nokia extends Phone{
    private String phoneMemory;

    public Nokia(String name, String phoneMemory) {
        super(name);
        this.phoneMemory = phoneMemory;
    }

    @Override
    public void print() {
        System.out.println("Phone: " + "Nokia" + "\nNokia memory: " + phoneMemory);
    }
}
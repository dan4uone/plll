package com.company;

public class Samsung extends Phone {
    private String model;


    public Samsung(String name, String model) {
        super(name);
        this.model = model;
    }

    @Override
    public void print() {
        System.out.println("Phone: " + "Samsung" + "\nSamsung model: " + model);
    }
}
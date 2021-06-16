package com.metanit;

public class Tomato extends Vegetable {
    public final static int calorieFor100Gramm= 20;
    private String color;

    public Tomato(int weight, String color) {
        super(weight, calorieFor100Gramm);

        this.color = color;
    }



    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return color + " tomato, weight: " + weight + " gramm"+calorieContent +
                "calorieContent" + " kcal.";
    }
}


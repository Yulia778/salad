package com.metanit;

public class Main {

    public static void main(String[] args) {

        Salad toastyOne = initialize();

        System.out.println("Overall salad calorific value - " + toastyOne.getCalorieContent(10, 40));



        System.out.println(toastyOne.getCalorieContent(10, 40));
    }

    private static Salad initialize() {
        Salad one = new Salad();
        one.addIngredient(new Potato((int) (Math.random() * 100 + 20), false));
        one.addIngredient(new Tomato((int) (Math.random() * 100 + 20),  "Red"));
        return one;
    }
    }


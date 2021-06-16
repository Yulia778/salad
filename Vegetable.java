package com.metanit;

import java.util.Objects;

public  abstract class Vegetable {
    protected int weight;
    protected int calorieContent;
    protected Vegetable(int weight, int calorieFor100Gramm) {
        this.weight = weight;
        this.calorieContent =  weight * calorieFor100Gramm;}
protected Vegetable(){

}

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getCalorieContent() {
        return calorieContent;
    }

    public void setCalorieContent(int calorieContent) {
        this.calorieContent = calorieContent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vegetable vegetable = (Vegetable) o;
        return weight == vegetable.weight && calorieContent == vegetable.calorieContent;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight, calorieContent);
    }

    @Override
    public String toString() {
        return "Vegetable{" +
                "weight=" + weight +
                ", calorieContent=" + calorieContent +
                '}';
    }
}

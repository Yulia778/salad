package com.metanit;

public class Potato extends Vegetable {
    public final static int calorieFor100Gramm = 80;
    public final static String COLOR = "Brown";
    private boolean isRotten;
    public Potato(int weight, boolean isRotten) {
        super(weight, calorieFor100Gramm);
        this.isRotten = isRotten;}

    public boolean isRotten() {
        return isRotten;
    }

    public void setRotten(boolean rotten) {
        isRotten = rotten;
    }

    @Override
    public String toString() {
        return COLOR + " potato, weight: " + weight + " gramm, isRotten : " + isRotten + ", calorifieContent: "
                + calorieContent + " kcal.";
    }
}

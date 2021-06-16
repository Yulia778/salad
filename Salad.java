package com.metanit;

    public class Salad {

        private Vegetable[] ingredients;
        private int currentIndex = 0;
        private final static int DEFAULT_CAPASITY = 10;

        public Salad(int saladCapasity) {
            this.ingredients = new Vegetable[saladCapasity];
        }

        public Salad() {
            this(DEFAULT_CAPASITY);
        }

        public Vegetable[] getIngridients() {
            return ingredients;
        }

        public int getCalorieContent(int i, int i1) {
            int total = 0;
            for (Vegetable vegetable : ingredients) {
                if (vegetable == null)
                    break;
                total += vegetable.getCalorieContent();
            }
            return total;
        }

        public boolean addIngredient(Vegetable ingridient) {
            if (currentIndex < ingredients.length) {
                ingredients[currentIndex] = ingridient;
                currentIndex++;
                return true;
            } else
                return false;
        }

        public boolean removeIngredient() {
            if (currentIndex >= 0) {
                ingredients[currentIndex] = null;
                currentIndex--;
                return true;
            } else
                return false;
        }
}

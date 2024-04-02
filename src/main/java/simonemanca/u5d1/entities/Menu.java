package simonemanca.u5d1.entities;

import java.util.List;

public class Menu {
    private List<Pizza> pizzas;
    private List<Drink> drinks;

    public Menu(List<Pizza> pizzas, List<Drink> drinks) {
        this.pizzas = pizzas;
        this.drinks = drinks;
    }

    public void printMenu() {
        System.out.println("Menu:");
        for (Pizza pizza : pizzas) {
            System.out.println(pizza.getName() + ": " + pizza.getPrice() + " - Calories: " + pizza.getCalories());
            for (Topping topping : pizza.getToppings()) {
                System.out.println("   Topping: " + topping.getName() + " (+ " + topping.getPrice() + ")");
            }
        }
        for (Drink drink : drinks) {
            System.out.println(drink.getName() + ": " + drink.getPrice() + " - Calories: " + drink.getCalories());
        }
    }

}


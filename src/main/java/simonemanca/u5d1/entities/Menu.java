package simonemanca.u5d1.entities;

import java.util.List;

public class Menu {
    private List<Pizza> pizzas;
    private List<Drink> drinks;

    // Costruttore che inizializza le liste di pizze e bibite
    public Menu(List<Pizza> pizzas, List<Drink> drinks) {
        this.pizzas = pizzas;
        this.drinks = drinks;
    }

    // Metodo per ottenere la lista di pizze
    public List<Pizza> getPizzas() {
        return pizzas;
    }

    // Metodo per ottenere la lista di bibite
    public List<Drink> getDrinks() {
        return drinks;
    }

    // Metodo per stampare i dettagli del menu
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



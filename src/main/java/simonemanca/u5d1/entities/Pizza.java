package simonemanca.u5d1.entities;

import java.util.ArrayList;
import java.util.List;

public class Pizza extends MenuItem {
    private List<Topping> toppings;

    public Pizza(String name, double price, int calories) {
        super(name, price, calories);
        this.toppings = new ArrayList<>();
        // Aggiungere i topping base di pomodoro e mozzarella
    }

    public void addTopping(Topping topping) {
        toppings.add(topping);
    }

    // Metodo per ottenere la lista di toppings
    public List<Topping> getToppings() {
        return toppings;
    }
}


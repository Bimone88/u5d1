package simonemanca.u5d1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import simonemanca.u5d1.entities.Drink;
import simonemanca.u5d1.entities.Menu;
import simonemanca.u5d1.entities.Pizza;
import simonemanca.u5d1.entities.Topping;

import java.util.Arrays;
import java.util.List;

@Configuration
public class PizzeriaConfig {

    // Bean per i toppings
    @Bean
    public Topping cheeseTopping() {
        return new Topping("Cheese", 0.69, 92);
    }

    @Bean
    public Topping hamTopping() {
        return new Topping("Ham", 0.99, 35);
    }

    @Bean
    public Topping onionTopping() {
        return new Topping("Onion", 0.69, 22);
    }

    @Bean
    public Topping pineappleTopping() {
        return new Topping("Pineapple", 0.79, 24);
    }

    @Bean
    public Topping salamiTopping() {
        return new Topping("Salami", 0.99, 86);
    }

    // Bean per le pizze
    @Bean
    public Pizza margheritaPizza() {
        Pizza pizza = new Pizza("Pizza Margherita", 4.99, 1104);
        pizza.addTopping(cheeseTopping()); // Mozzarella
        pizza.addTopping(tomatoTopping()); // Pomodoro
        return pizza;
    }

    @Bean
    public Pizza hawaiianPizza() {
        Pizza pizza = new Pizza("Hawaiian Pizza", 6.49, 1024);
        pizza.addTopping(cheeseTopping());
        pizza.addTopping(hamTopping());
        pizza.addTopping(pineappleTopping());
        return pizza;
    }

    @Bean
    public Pizza salamiPizza() {
        Pizza pizza = new Pizza("Salami Pizza", 5.99, 1160);
        pizza.addTopping(cheeseTopping());
        pizza.addTopping(salamiTopping());
        return pizza;
    }

    // Bean per le bevande
    @Bean
    public Drink lemonadeDrink() {
        return new Drink("Lemonade", 1.29, 128);
    }

    @Bean
    public Drink waterDrink() {
        return new Drink("Water", 1.29, 0);
    }

    @Bean
    public Drink wineDrink() {
        return new Drink("Wine", 7.49, 607);
    }

    // Bean per il menu
    @Bean
    public Menu menu() {
        List<Pizza> pizzas = Arrays.asList(margheritaPizza(), hawaiianPizza(), salamiPizza());
        List<Drink> drinks = Arrays.asList(lemonadeDrink(), waterDrink(), wineDrink());
        return new Menu(pizzas, drinks);
    }

    // Metodi helper per i toppings base
    private Topping tomatoTopping() {
        // Assumendo che un topping di pomodoro sia simile a questo
        return new Topping("Tomato", 0.50, 20);
    }
}

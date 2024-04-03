package simonemanca.u5d1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import simonemanca.u5d1.entities.Drink;
import simonemanca.u5d1.entities.Menu;
import simonemanca.u5d1.entities.Ordine;
import simonemanca.u5d1.entities.Pizza;
import simonemanca.u5d1.entities.Topping;
import simonemanca.u5d1.entities.Ordine.StatoOrdine;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@Component
public class OrdineRunner implements CommandLineRunner {

    @Value("${coperto.costo}")
    private double costoCoperto;

    @Autowired
    private Menu menu; // Assicurati che questo Bean sia correttamente configurato in Spring

    @Override
    public void run(String... args) throws Exception {
        // Assumi che Menu sia già configurato e iniettato tramite Spring
        // Se necessario inizializzare il menu qui, il codice è già fornito sotto

        // Creazione dell'ordine
        Ordine ordine = new Ordine("12345", StatoOrdine.IN_CORSO, 4, LocalDateTime.now());
        // Qui aggiungiamo alcuni elementi dal menu all'ordine
        menu.getPizzas().forEach(ordine::aggiungiElemento);
        menu.getDrinks().forEach(ordine::aggiungiElemento);

        // Calcolo dell'importo totale
        ordine.calcolaImportoTotale(costoCoperto);

        // Stampa dell'ordine usando il logger o System.out.println per semplicità
        System.out.println(ordine.toString());
    }

    private Menu inizializzaMenu() {
        // Toppinggggsss
        Topping mozzarella = new Topping("Mozzarella", 0.50, 100);
        Topping pomodoro = new Topping("Pomodoro", 0.30, 50);
        Topping salame = new Topping("Salame", 0.70, 150);

        // Margherita:
        Pizza margherita = new Pizza("Margherita", 5.00, 800);
        margherita.addTopping(pomodoro); // Aggiunge il pomodoro come topping base
        margherita.addTopping(mozzarella); // Aggiunge la mozzarella come topping base

        // Diavola:
        Pizza diavola = new Pizza("Diavola", 6.50, 900);
        diavola.addTopping(pomodoro); // Aggiunge il pomodoro come topping base
        diavola.addTopping(mozzarella); // Aggiunge la mozzarella come topping base
        diavola.addTopping(salame); // Aggiunge salame

        // Drink:
        Drink acqua = new Drink("Acqua", 1.00, 0);
        Drink birra = new Drink("Birra", 3.00, 150);

        // Crea le liste di pizze e bibite per il menu
        List<Pizza> pizze = Arrays.asList(margherita, diavola);
        List<Drink> bibite = Arrays.asList(acqua, birra);

        // Crea e restituisce il menu
        return new Menu(pizze, bibite);
    }
}



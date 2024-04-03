package simonemanca.u5d1.entities;

public abstract class MenuItem {
    private String name;
    private double price;
    private int calories;

    public MenuItem(String name, double price, int calories) {
        this.name = name;
        this.price = price;
        this.calories = calories;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }


    public double getPrezzo() {
        double prezzo = 1.5;
        return prezzo;
    }
}



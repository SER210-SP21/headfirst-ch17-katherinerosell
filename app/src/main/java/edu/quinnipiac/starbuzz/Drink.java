package edu.quinnipiac.starbuzz;
public class Drink {
    private String name;
    private String description;
    private int imageResourceId;

    // Drinks is an array of Drinks
    public static final Drink[] drinks = {
            new Drink("Latte", "A couple of espresso shots with steamed milk", R.drawable.latte),
            new Drink("Cappuccino", "Espresso, hot milk, and a steamed milk foam", R.drawable.cappuccino),
            new Drink("Filter", "Highest quality beans roasted and brewed fresh", R.drawable.filter),
            new Drink("Chai Latte", "Organically spiced tea with milk", R.drawable.chai),
            new Drink("Irish Breakfast Tea", "Black tea with hints of dark spices", R.drawable.irishbreakfasttea)
    };

    private Drink(String name, String description, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public String getDescription() { return description; }

    public String getName() {
        return name;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public String toString() {
        return this.name;
    }
}
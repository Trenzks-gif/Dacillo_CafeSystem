/**
 *
 * This Represents a more like a generic item on the university Cafe Menu
 * This a class that is Abstract, so it cannot be instantiated directly.
 * Each Subclass (Beverage, Pastry, Meal) defines how its own price is computed.
 * @author Denzemiel Ethan S. Dacillo
 * @version 1.0
 *
 */
public abstract class MenuItem {
    protected String name;
    protected double basePrice;
    private String itemCode;

    /**
     * This Creates a menu item with default values: the name "Unnamed Item",
     * a base price of 0.0, and the item code "N/A".
     *
     */
    public MenuItem() {
        this.name = "Unnamed Item";
        this.basePrice = 0.0;
        this.itemCode = "N/A";
    }
    /**
     * Creates a menu item with the given information.
     *
     * @param name the name of the item
     * @param basePrice the starting price of the item
     * @param itemCode the item's identification code
     */
    public MenuItem(String name, double basePrice, String itemCode) {
        setName(name);
        setBasePrice(basePrice);
        setItemCode(itemCode);
    }

    public String getName() {
        return name;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public String getItemCode() {
        return itemCode;
    }
    /**
     * Returns the item's name and code.
     *
     * @return the item description
     */
    public String getDescription() {
        return name + " ["+ itemCode+"]";
    }


    public void setName(String name) {
        this.name = name;
    }
    /**
     * Updates the base price of the item.
     *
     * @param basePrice the new price
     */
    public void setBasePrice(double basePrice) {
        // When the base price is below zero, it will print out an error message
        if (basePrice < 0) {
            System.out.println("Error: base price cannot be negative.");
        } else {
            this.basePrice = basePrice;
        }
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }
    /**
     * Calculates the final price of the item.
     * Subclasses implement their own pricing rules.
     *
     * @return the computed price
     */
    public abstract double computePrice();




}

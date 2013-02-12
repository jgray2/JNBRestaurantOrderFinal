
package model;


/**
 *
 * @author Jenni Burgmeier
 */

public class Drink {
    
    private String name;
    private double price;
    private double waterP = 0;
    private double beerP = 3.50;
    private double sodaP = 1.75;
    private final String type1 = "Water";
    private final String type2 = "Beer";
    private final String type3 = "Soda";

    public Drink() {
    }

    public Drink(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        if (name.equals(type1)){
            price = waterP;
        } else if (name.equals(type2)){
            price = beerP;
        } else {
            price = sodaP;
        }    
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + (this.name != null ? this.name.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Drink other = (Drink) obj;
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Drink{" + "name=" + name + ", price=" + price + '}';
    }

   
    
}

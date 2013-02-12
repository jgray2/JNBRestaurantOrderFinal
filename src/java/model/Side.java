package model;

/**
 *
 * @author Jenni Burgmeier
 */
public class Side {

    private String name;
    private double price;
    private double sideSa = 3.50;
    private double sideSo = 2.95;
    private final String type1 = "Salad";
    private final String type2 = "Soup";

    public Side() {
    }

    public Side(String name, double price) {
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
        if (name.equals(type1)) {
            price = sideSa;
        } else if (name.equals(type2)) {
            price = sideSo;
        }
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + (this.name != null ? this.name.hashCode() : 0);
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
        final Side other = (Side) obj;
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Side{" + "name=" + name + ", price=" + price + '}';
    }
}

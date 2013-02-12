package model;

/**
 *
 * @author Jenni Burgmeier
 */
public class Entree {

    private String name;
    private double price;
    private double entreeS = 19.96;
    private double entreeC = 14.95;
    private double entreeL = 24.95;
    private double entreeSh = 18.98;
    private final String type1 = "Steak";
    private final String type2 = "Chicken";
    private final String type3 = "Lobster";
    private final String type4 = "Shrimp";

    public Entree() {
    }

    public Entree(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getEntreeName() {
        return name;
    }

    public void setEntreeName(String entreeName) {
        this.name = entreeName;
    }

    public final double getPrice() {
        if (name.equals(type1)) {
            price = entreeS;
        } else if (name.equals(type2)) {
            price = entreeC;
        } else if (name.equals(type3)) {
            price = entreeL;
        } else {
            price = entreeSh;
        }
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + (this.name != null ? this.name.hashCode() : 0);
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
        final Entree other = (Entree) obj;
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entree{" + "name=" + name + ", price=" + price + '}';
    }
}

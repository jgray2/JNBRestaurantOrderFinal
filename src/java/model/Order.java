
package model;

/**
 *
 * @author Jenni Burgmeier
 */
public class Order {
    private Drink drink;
    private Side side;
    private Entree entree;
    private double totalOrder;
    private double tax;
    private double taxPerc = 0.051;
    private double suggestedTip;
    private double tipPerc = 0.15;

    public Order() {
       drink = new Drink();
       side = new Side();
       entree = new Entree();
    }

    public Order(Drink drink, Side side, Entree entree) {
        this.drink = drink;
        this.side = side;
        this.entree = entree;
    }

    public Drink getDrink() {
        return drink;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }

    public Side getSide() {
        return side;
    }

    public void setSide(Side side) {
        this.side = side;
    }

    public Entree getEntree() {
        return entree;
    }

    public void setEntree(Entree entree) {
        this.entree = entree;
    }    
    
    public final void calculateOrder () {
        totalOrder = drink.getPrice() + entree.getPrice() + side.getPrice();
        tax = totalOrder * taxPerc;
        totalOrder = totalOrder + tax;
    }

    public final double getTotalOrder() {
        return totalOrder;
    }

    public final double getTax() {
        return tax;
    }

    public final double getSuggestedTip() {
        suggestedTip = totalOrder * tipPerc;
        return suggestedTip;
    }
    
}


package model;


/**
 *
 * @author Jenni Burgmeier
 */
public class OrderService {
    private Order order;
    private IOrderDAO dao = new OrderDAO();
    private String nameD;
    private String nameE;
    private String nameS;

    public void createOrder() {
        dao.create(); 
    }
    public void finalizeOrder() {
        order.calculateOrder();
    }
    
    public IOrderDAO getDao() {
        return dao;
    }

    public void setDao(IOrderDAO dao) {
        this.dao = dao;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public String getNameD() {
        return nameD;
    }

    public void setNameD(String nameD) {
        this.nameD = nameD;
    }

    public String getNameE() {
        return nameE;
    }

    public void setNameE(String nameE) {
        this.nameE = nameE;
    }

    public String getNameS() {
        return nameS;
    }

    public void setNameS(String nameS) {
        this.nameS = nameS;
    }
    
}

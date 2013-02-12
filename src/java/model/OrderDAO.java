
package model;

import java.util.List;

/**
 *
 * @author Jenni Burgmeier
 */
public class OrderDAO implements IOrderDAO {

    
    @Override
    public void create() {
        Order order = new Order();
    }

    @Override
    public void deleteById(Long id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void deleteOrder(Order order) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void update(Order order) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Order findOrder(Long id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Order> findOrders() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Order> findOrders(int maxResults, int firstResult) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}

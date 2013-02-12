package model;

import java.util.List;

/**
 *
 * @author Jenni Burgmeier
 */
public interface IOrderEAO {

    void create(Order order);

    void deleteById(Long id);

    public void deleteOrder(Order order);

    void update(Order order);

    Order findOrder(Long id);

    List<Order> findOrders();

    List<Order> findOrders(int maxResults, int firstResult);
}

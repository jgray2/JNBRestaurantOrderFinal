
package model;

import javax.inject.Inject;

/**
 *
 * @author Jenni Burgmeier
 */
public class OrderService {
    @Inject
    private IOrderEAO eao;

    public IOrderEAO getEao() {
        return eao;
    }

    public void setEao(IOrderEAO eao) {
        this.eao = eao;
    }
    
}

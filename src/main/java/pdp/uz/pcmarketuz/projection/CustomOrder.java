package pdp.uz.pcmarketuz.projection;

import org.springframework.data.rest.core.config.Projection;
import pdp.uz.pcmarketuz.entity.Address;
import pdp.uz.pcmarketuz.entity.District;
import pdp.uz.pcmarketuz.entity.Order;
import pdp.uz.pcmarketuz.entity.UserBasket;

import javax.persistence.OneToOne;
import java.util.Date;

@Projection(types = Order.class)
public interface CustomOrder {
    Integer getId();

    Date getDate();

    UserBasket getUserBasket();

    String getDetails();
}

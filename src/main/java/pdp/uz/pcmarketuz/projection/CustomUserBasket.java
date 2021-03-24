package pdp.uz.pcmarketuz.projection;

import org.springframework.data.rest.core.config.Projection;
import pdp.uz.pcmarketuz.entity.Address;
import pdp.uz.pcmarketuz.entity.OutputProduct;
import pdp.uz.pcmarketuz.entity.User;
import pdp.uz.pcmarketuz.entity.UserBasket;

import javax.persistence.OneToMany;
import java.util.List;

@Projection(types = UserBasket.class)
public interface CustomUserBasket {
    Integer getId();

    List<OutputProduct> getOutputProduct();
}

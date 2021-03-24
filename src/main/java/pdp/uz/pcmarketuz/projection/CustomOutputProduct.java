package pdp.uz.pcmarketuz.projection;

import org.springframework.data.rest.core.config.Projection;
import pdp.uz.pcmarketuz.entity.Address;
import pdp.uz.pcmarketuz.entity.District;
import pdp.uz.pcmarketuz.entity.OutputProduct;
import pdp.uz.pcmarketuz.entity.Product;

import javax.persistence.ManyToOne;

@Projection(types = OutputProduct.class)
public interface CustomOutputProduct {
    Integer getId();

    Product getProduct();

    Integer getAmount();
}

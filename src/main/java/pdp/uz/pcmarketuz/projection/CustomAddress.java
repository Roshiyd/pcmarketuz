package pdp.uz.pcmarketuz.projection;

import org.springframework.data.rest.core.config.Projection;
import pdp.uz.pcmarketuz.entity.Address;
import pdp.uz.pcmarketuz.entity.District;

import javax.persistence.ManyToOne;

@Projection(types = Address.class)
public interface CustomAddress {
    Integer getId();

    String getStreet();

    String getHomeNumber();

    District getDistrict();
}

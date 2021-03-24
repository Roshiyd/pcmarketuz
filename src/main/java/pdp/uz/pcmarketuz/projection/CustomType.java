package pdp.uz.pcmarketuz.projection;

import org.springframework.data.rest.core.config.Projection;
import pdp.uz.pcmarketuz.entity.Address;
import pdp.uz.pcmarketuz.entity.Type;
import pdp.uz.pcmarketuz.entity.User;

@Projection(types = Type.class)
public interface CustomType {
    Integer getId();

    String getName();

    String getValue();
}

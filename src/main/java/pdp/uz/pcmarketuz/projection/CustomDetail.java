package pdp.uz.pcmarketuz.projection;

import org.springframework.data.rest.core.config.Projection;
import pdp.uz.pcmarketuz.entity.Address;
import pdp.uz.pcmarketuz.entity.Detail;
import pdp.uz.pcmarketuz.entity.District;

@Projection(types = Detail.class)
public interface CustomDetail {

    Integer getId();

    String getValue();
}

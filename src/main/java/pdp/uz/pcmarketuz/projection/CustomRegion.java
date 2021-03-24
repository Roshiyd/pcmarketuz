package pdp.uz.pcmarketuz.projection;

import org.springframework.data.rest.core.config.Projection;
import pdp.uz.pcmarketuz.entity.Region;
import pdp.uz.pcmarketuz.entity.Type;

@Projection(types = Region.class)
public interface CustomRegion {
    Integer getId();

    String getName();


}

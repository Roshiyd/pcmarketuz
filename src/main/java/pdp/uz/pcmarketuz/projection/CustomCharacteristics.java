package pdp.uz.pcmarketuz.projection;

import org.springframework.data.rest.core.config.Projection;
import pdp.uz.pcmarketuz.entity.Address;
import pdp.uz.pcmarketuz.entity.Characteristics;
import pdp.uz.pcmarketuz.entity.District;
import pdp.uz.pcmarketuz.entity.Type;

import java.util.List;

@Projection(types = Characteristics.class)
public interface CustomCharacteristics {
    Integer getId();

    List<Type> getTypes();
}

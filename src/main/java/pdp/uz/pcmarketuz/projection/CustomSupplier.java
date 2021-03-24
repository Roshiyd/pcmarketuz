package pdp.uz.pcmarketuz.projection;

import org.springframework.data.rest.core.config.Projection;
import pdp.uz.pcmarketuz.entity.Address;
import pdp.uz.pcmarketuz.entity.Supplier;
import pdp.uz.pcmarketuz.entity.User;

@Projection(types = Supplier.class)
public interface CustomSupplier {
    Integer getId();

    String getFullName();

    String getEmail();

    String getPhoneNumber();

    String getMessageBody();
}

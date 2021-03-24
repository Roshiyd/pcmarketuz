package pdp.uz.pcmarketuz.projection;

import org.springframework.data.rest.core.config.Projection;
import pdp.uz.pcmarketuz.entity.Address;
import pdp.uz.pcmarketuz.entity.District;
import pdp.uz.pcmarketuz.entity.User;

import javax.persistence.Column;
import javax.persistence.OneToOne;

@Projection(types = User.class)
public interface CustomUser {
    Integer getId();

    String getFullName();

    String getEmail();

    String getPassword();

    Address getAddress();
}

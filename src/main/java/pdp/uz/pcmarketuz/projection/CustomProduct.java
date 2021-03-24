package pdp.uz.pcmarketuz.projection;

import org.springframework.data.rest.core.config.Projection;
import pdp.uz.pcmarketuz.entity.*;

import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Projection(types = Product.class)
public interface CustomProduct {
    Integer getId();

    String getName();

    String getModel();

    Attachment getAttachment();

    String getPrice();

    Category getCategory();

    boolean getActive();

    Characteristics getCharacteristics();
}

package pdp.uz.pcmarketuz.projection;

import org.springframework.data.rest.core.config.Projection;
import pdp.uz.pcmarketuz.entity.*;

import javax.persistence.ManyToOne;

@Projection(types = Comments.class)
public interface CustomComments {
    Integer getId();

    String getBody();

    User getUser();

    Product getProduct();

    Integer getNumberStar();
}

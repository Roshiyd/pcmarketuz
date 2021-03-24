package pdp.uz.pcmarketuz.projection;

import org.springframework.data.rest.core.config.Projection;
import pdp.uz.pcmarketuz.entity.Address;
import pdp.uz.pcmarketuz.entity.Category;
import pdp.uz.pcmarketuz.entity.District;

import javax.persistence.ManyToOne;

@Projection(types = Category.class)
public interface CustomCategory {
    Integer getId();

    String getNameUz();

    String getNameRu();

    String getNameEng();

    Category getParentCategory();
}

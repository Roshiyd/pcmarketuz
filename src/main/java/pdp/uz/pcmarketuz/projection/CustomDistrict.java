package pdp.uz.pcmarketuz.projection;

import org.springframework.data.rest.core.config.Projection;
import pdp.uz.pcmarketuz.entity.Attachment;
import pdp.uz.pcmarketuz.entity.District;
import pdp.uz.pcmarketuz.entity.MyTeam;
import pdp.uz.pcmarketuz.entity.Region;

import javax.persistence.ManyToOne;

@Projection(types = District.class)
public interface CustomDistrict {
    Integer getId();

    String getName();

    Region getRegion();
}

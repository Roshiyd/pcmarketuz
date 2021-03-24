package pdp.uz.pcmarketuz.projection;

import org.springframework.data.rest.core.config.Projection;
import pdp.uz.pcmarketuz.entity.Attachment;
import pdp.uz.pcmarketuz.entity.MyTeam;
import pdp.uz.pcmarketuz.entity.Order;
import pdp.uz.pcmarketuz.entity.UserBasket;

import javax.persistence.OneToOne;
import java.util.Date;

@Projection(types = MyTeam.class)
public interface CustomMyTeam {
    Integer getId();

    String getName();

    String getOccupation();

    Attachment getAttachment();
}

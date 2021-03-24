package pdp.uz.pcmarketuz.projection;

import org.springframework.data.rest.core.config.Projection;
import pdp.uz.pcmarketuz.entity.Address;
import pdp.uz.pcmarketuz.entity.Article;
import pdp.uz.pcmarketuz.entity.Attachment;
import pdp.uz.pcmarketuz.entity.District;

import javax.persistence.OneToOne;

@Projection(types = Article.class)
public interface CustomArticle {
    Integer getId();

    String getTitle();

    String getDescription();

    String getUrlLink();

    Attachment getAttachment();
}

package pdp.uz.pcmarketuz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pdp.uz.pcmarketuz.entity.Article;
import pdp.uz.pcmarketuz.entity.Category;
import pdp.uz.pcmarketuz.projection.CustomArticle;
import pdp.uz.pcmarketuz.projection.CustomCategory;

@RepositoryRestResource(path = "article",collectionResourceRel = "list",excerptProjection = CustomArticle.class)
public interface ArticleRepository extends JpaRepository<Article,Integer> {
}

package pdp.uz.pcmarketuz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pdp.uz.pcmarketuz.entity.Category;
import pdp.uz.pcmarketuz.entity.Characteristics;
import pdp.uz.pcmarketuz.projection.CustomCategory;
import pdp.uz.pcmarketuz.projection.CustomCharacteristics;

@RepositoryRestResource(path = "category",collectionResourceRel = "list",excerptProjection = CustomCategory.class)
public interface CategoryRepository extends JpaRepository<Category,Integer> {
}

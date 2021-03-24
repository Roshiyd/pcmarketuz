package pdp.uz.pcmarketuz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pdp.uz.pcmarketuz.entity.Product;
import pdp.uz.pcmarketuz.entity.Region;
import pdp.uz.pcmarketuz.projection.CustomProduct;
import pdp.uz.pcmarketuz.projection.CustomRegion;

@RepositoryRestResource(path = "product",collectionResourceRel = "list",excerptProjection = CustomProduct.class)
public interface ProductRepository extends JpaRepository<Product,Integer> {
}

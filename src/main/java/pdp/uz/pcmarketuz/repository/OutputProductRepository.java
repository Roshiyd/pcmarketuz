package pdp.uz.pcmarketuz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pdp.uz.pcmarketuz.entity.OutputProduct;
import pdp.uz.pcmarketuz.entity.Product;
import pdp.uz.pcmarketuz.projection.CustomOutputProduct;
import pdp.uz.pcmarketuz.projection.CustomProduct;

@RepositoryRestResource(path = "output",collectionResourceRel = "list",excerptProjection = CustomOutputProduct.class)
public interface OutputProductRepository extends JpaRepository<OutputProduct,Integer> {
}

package pdp.uz.pcmarketuz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pdp.uz.pcmarketuz.entity.Supplier;
import pdp.uz.pcmarketuz.entity.Type;
import pdp.uz.pcmarketuz.projection.CustomSupplier;
import pdp.uz.pcmarketuz.projection.CustomType;

@RepositoryRestResource(path = "supplier",collectionResourceRel = "list",excerptProjection = CustomSupplier.class)
public interface SupplierRepository extends JpaRepository<Supplier,Integer> {
}

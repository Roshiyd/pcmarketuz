package pdp.uz.pcmarketuz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pdp.uz.pcmarketuz.entity.Region;
import pdp.uz.pcmarketuz.entity.Supplier;
import pdp.uz.pcmarketuz.projection.CustomRegion;
import pdp.uz.pcmarketuz.projection.CustomSupplier;

@RepositoryRestResource(path = "region",collectionResourceRel = "list",excerptProjection = CustomRegion.class)
public interface RegionRepository extends JpaRepository<Region,Integer> {
}

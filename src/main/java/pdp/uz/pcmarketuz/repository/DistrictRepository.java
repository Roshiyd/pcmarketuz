package pdp.uz.pcmarketuz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pdp.uz.pcmarketuz.entity.District;
import pdp.uz.pcmarketuz.entity.MyTeam;
import pdp.uz.pcmarketuz.projection.CustomDistrict;
import pdp.uz.pcmarketuz.projection.CustomMyTeam;

@RepositoryRestResource(path = "district",collectionResourceRel = "list",excerptProjection = CustomDistrict.class)
public interface DistrictRepository extends JpaRepository<District,Integer> {
}

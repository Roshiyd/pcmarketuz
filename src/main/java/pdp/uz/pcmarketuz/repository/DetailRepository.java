package pdp.uz.pcmarketuz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pdp.uz.pcmarketuz.entity.Detail;
import pdp.uz.pcmarketuz.entity.District;
import pdp.uz.pcmarketuz.projection.CustomDetail;
import pdp.uz.pcmarketuz.projection.CustomDistrict;

@RepositoryRestResource(path = "detail",collectionResourceRel = "list",excerptProjection = CustomDetail.class)
public interface DetailRepository extends JpaRepository<Detail,Integer> {
}

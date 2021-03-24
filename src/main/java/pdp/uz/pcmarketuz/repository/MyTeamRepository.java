package pdp.uz.pcmarketuz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pdp.uz.pcmarketuz.entity.MyTeam;
import pdp.uz.pcmarketuz.entity.Order;
import pdp.uz.pcmarketuz.projection.CustomMyTeam;
import pdp.uz.pcmarketuz.projection.CustomOrder;

@RepositoryRestResource(path = "myTeam",collectionResourceRel = "list",excerptProjection = CustomMyTeam.class)
public interface MyTeamRepository extends JpaRepository<MyTeam,Integer> {
}

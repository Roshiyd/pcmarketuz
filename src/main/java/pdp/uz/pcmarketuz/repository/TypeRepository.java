package pdp.uz.pcmarketuz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pdp.uz.pcmarketuz.entity.Type;
import pdp.uz.pcmarketuz.entity.User;
import pdp.uz.pcmarketuz.projection.CustomType;
import pdp.uz.pcmarketuz.projection.CustomUser;

@RepositoryRestResource(path = "type",collectionResourceRel = "list",excerptProjection = CustomType.class)
public interface TypeRepository extends JpaRepository<Type,Integer> {
}

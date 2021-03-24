package pdp.uz.pcmarketuz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pdp.uz.pcmarketuz.entity.Address;
import pdp.uz.pcmarketuz.entity.User;
import pdp.uz.pcmarketuz.projection.CustomUser;
import pdp.uz.pcmarketuz.projection.CustomUserBasket;

@RepositoryRestResource(path = "user",collectionResourceRel = "list",excerptProjection = CustomUser.class)
public interface UserRepository extends JpaRepository<User,Integer> {
}

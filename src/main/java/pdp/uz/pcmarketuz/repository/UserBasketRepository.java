package pdp.uz.pcmarketuz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pdp.uz.pcmarketuz.entity.Address;
import pdp.uz.pcmarketuz.entity.UserBasket;
import pdp.uz.pcmarketuz.projection.CustomAddress;
import pdp.uz.pcmarketuz.projection.CustomUserBasket;

@RepositoryRestResource(path = "userBasket",collectionResourceRel = "list",excerptProjection = CustomUserBasket.class)
public interface UserBasketRepository extends JpaRepository<UserBasket,Integer> {
}

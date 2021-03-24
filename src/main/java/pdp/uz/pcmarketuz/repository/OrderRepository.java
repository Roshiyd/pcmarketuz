package pdp.uz.pcmarketuz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pdp.uz.pcmarketuz.entity.Order;
import pdp.uz.pcmarketuz.entity.OutputProduct;
import pdp.uz.pcmarketuz.projection.CustomOrder;
import pdp.uz.pcmarketuz.projection.CustomOutputProduct;

@RepositoryRestResource(path = "order",collectionResourceRel = "list",excerptProjection = CustomOrder.class)
public interface OrderRepository extends JpaRepository<Order,Integer> {
}

package pdp.uz.pcmarketuz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pdp.uz.pcmarketuz.entity.Characteristics;
import pdp.uz.pcmarketuz.entity.Comments;
import pdp.uz.pcmarketuz.projection.CustomCharacteristics;
import pdp.uz.pcmarketuz.projection.CustomComments;

@RepositoryRestResource(path = "characteristics",collectionResourceRel = "list",excerptProjection = CustomCharacteristics.class)
public interface CharacteristicsRepository extends JpaRepository<Characteristics,Integer> {
}

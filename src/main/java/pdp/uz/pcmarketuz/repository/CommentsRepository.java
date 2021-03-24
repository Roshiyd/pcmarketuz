package pdp.uz.pcmarketuz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pdp.uz.pcmarketuz.entity.Comments;
import pdp.uz.pcmarketuz.entity.Detail;
import pdp.uz.pcmarketuz.projection.CustomComments;
import pdp.uz.pcmarketuz.projection.CustomDetail;

@RepositoryRestResource(path = "comments",collectionResourceRel = "list",excerptProjection = CustomComments.class)
public interface CommentsRepository extends JpaRepository<Comments,Integer> {
}

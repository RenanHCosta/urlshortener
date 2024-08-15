package renan.costa.urlshortener.respository;

import org.springframework.data.mongodb.repository.MongoRepository;
import renan.costa.urlshortener.entities.UrlEntity;

public interface UrlRepository extends MongoRepository<UrlEntity, String> {

}

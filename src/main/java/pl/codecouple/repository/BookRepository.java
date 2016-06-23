package pl.codecouple.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import pl.codecouple.domain.Book;

/**
 * Created by krzysztof.chrusciel on 2016-06-23.
 */
public interface BookRepository extends MongoRepository<Book, String>{
}

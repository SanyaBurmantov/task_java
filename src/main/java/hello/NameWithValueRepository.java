package hello;

import org.springframework.data.repository.CrudRepository;

public interface NameWithValueRepository extends CrudRepository<NameWithValueEntity, String> {
}


package be.sohael.projectadvanced.repositories;

import be.sohael.projectadvanced.model.Zaal;
import org.springframework.data.repository.CrudRepository;

public interface ZaalRepository extends CrudRepository<Zaal, Integer>{

    Iterable<Zaal> findBykleedkamers(boolean kleedkamers);
}

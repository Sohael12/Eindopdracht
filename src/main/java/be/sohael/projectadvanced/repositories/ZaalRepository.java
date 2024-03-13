package be.sohael.projectadvanced.repositories;

import be.sohael.projectadvanced.model.Zaal;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface ZaalRepository extends CrudRepository<Zaal,Integer>{

    Iterable<Zaal> findBykleedkamers(boolean kleedkamers);
    Optional<Zaal> findFirstByIdLessThanOrderByIdDesc(Integer id);
    Optional<Zaal> findFirstByOrderByIdDesc();
    Optional<Zaal> findFirstByIdGreaterThanOrderByIdAsc(Integer id);
    Optional<Zaal> findFirstByOrderByIdAsc();





    @Query("SELECT z FROM Zaal z WHERE" +
            " (:minTarief IS NULL OR z.tarief >= :minTarief) AND " +
            " (:capaciteit IS NULL OR z.capaciteit = :capaciteit) AND " +
            " (:maxTarief IS NULL OR z.tarief <= :maxTarief)")


    List<Zaal> findZalenByTariefRange(
            @Param("minTarief") Integer minTarief,
            @Param("maxTarief") Integer maxTarief,
            @Param("capaciteit") Integer capaciteit);

}

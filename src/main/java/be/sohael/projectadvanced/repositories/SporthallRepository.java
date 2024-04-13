package be.sohael.projectadvanced.repositories;


import be.sohael.projectadvanced.model.Sporthall;
import org.springframework.data.jpa.repository.Query;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;


public interface SporthallRepository extends CrudRepository<Sporthall,Integer> {

   ;
    Optional<Sporthall> findFirstByIdLessThanOrderByIdDesc(Integer id);
    Optional<Sporthall> findFirstByOrderByIdDesc();
    Optional<Sporthall> findFirstByIdGreaterThanOrderByIdAsc(Integer id);
    Optional<Sporthall> findFirstByOrderByIdAsc();





    @Query("SELECT s FROM Sporthall s WHERE" +
            " (:minTarief IS NULL OR s.rate >= :minTarief) AND " +
            " (:maxTarief IS NULL OR s.rate <= :maxTarief)AND "+
            " (:mincapaciteit IS NULL OR s.rate >= :mincapaciteit) AND " +
            " (:maxcapaciteit IS NULL OR s.rate <= :maxcapaciteit)AND "+
             "(:kleedkamers IS NULL OR s.dressingrooms = :kleedkamers)")
    List<Sporthall> findbyfilter(
            @Param("minTarief") Integer minTarief,
            @Param("maxTarief") Integer maxTarief,
            @Param("kleedkamers") Boolean kleedkamers,
            @Param("mincapaciteit") Integer mincapaciteit,
            @Param("maxcapaciteit") Integer maxcapaciteit);

}

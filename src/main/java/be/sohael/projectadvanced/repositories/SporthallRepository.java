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
            " (:minrate IS NULL OR :minrate <= s.rate) AND " +
            " (:maxrate IS NULL OR s.rate <= :maxrate)AND "+
            " (:mincapacity IS NULL OR s.capacity >= :mincapacity) AND " +
            " (:maxcapacity IS NULL OR s.capacity <= :maxcapacity)AND "+
             "(:dressingroom IS NULL OR s.dressingrooms = :dressingroom)")
    List<Sporthall> findbyfilter(
            @Param("minrate") Integer minrate,
            @Param("maxrate") Integer maxrate,
            @Param("dressingroom") Boolean dressingroom,
            @Param("mincapacity") Integer mincapacity,
            @Param("maxcapacity") Integer maxcapacity);

}

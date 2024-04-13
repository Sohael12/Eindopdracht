package be.sohael.projectadvanced.repositories;

import be.sohael.projectadvanced.model.Equipment;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;




public interface EquipmentRepository extends CrudRepository<Equipment,Integer> {



    @Query("SELECT e FROM Equipment e WHERE" +
            " (:minprijs IS NULL OR e.price >= :minprijs)AND "+
            "(:maxprijs IS NULL OR e.price <= :maxprijs) AND"+
            "(:beschikbaar IS NULL OR e.available = :beschikbaar)")
    List<Equipment> findbyfilter(
            @Param("minprijs") Integer minprijs,
            @Param("maxprijs") Integer maxprijs,
            @Param("beschikbaar") Boolean beschikbaar);
}

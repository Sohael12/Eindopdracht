package be.sohael.projectadvanced.repositories;

import be.sohael.projectadvanced.model.Equipment;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;




public interface EquipmentRepository extends CrudRepository<Equipment,Integer> {



    @Query("SELECT e FROM Equipment e WHERE" +
            " (:minprice IS NULL OR e.price >= :minprice)AND "+
            "(:maxprice IS NULL OR e.price <= :maxprice) AND"+
            "(:available IS NULL OR e.available = :available)")
    List<Equipment> findbyfilter(
            @Param("minprice") Integer minprice,
            @Param("maxprice") Integer maxprice,
            @Param("available") Boolean available);
}

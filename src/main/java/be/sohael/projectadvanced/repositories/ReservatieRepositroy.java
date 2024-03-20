package be.sohael.projectadvanced.repositories;

import be.sohael.projectadvanced.model.Equipment;
import be.sohael.projectadvanced.model.Reservatie;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ReservatieRepositroy extends CrudRepository<Reservatie,Integer> {




}

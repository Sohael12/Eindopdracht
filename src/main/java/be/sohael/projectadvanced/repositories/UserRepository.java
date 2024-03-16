package be.sohael.projectadvanced.repositories;

import be.sohael.projectadvanced.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Integer> {
}

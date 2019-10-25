package hu.codecoo.datascraper.repository;

import hu.codecoo.datascraper.entity.Users;
import org.springframework.data.repository.CrudRepository;

public interface UsersRepository extends CrudRepository<Users, Integer> {

    Users findByEmailAndPassword(String email, String password);
    Users save(Users users);
}

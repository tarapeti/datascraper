package hu.codecool.datascraper.jparepositroy;

import hu.codecool.datascraper.entity.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends CrudRepository<Users, Integer> {

    Users findByEmailAndPassword(String email, String password);
    Users save(Users users);
}

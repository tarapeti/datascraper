package hu.codecoo.datascraper.repository;

import hu.codecoo.datascraper.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Integer> {
}

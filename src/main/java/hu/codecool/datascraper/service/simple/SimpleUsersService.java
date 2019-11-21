package hu.codecool.datascraper.service.simple;

import hu.codecool.datascraper.entity.Users;
import hu.codecool.datascraper.jparepositroy.UsersJpaRepository;
import hu.codecool.datascraper.service.UsersService;
import org.springframework.stereotype.Service;

@Service
public class SimpleUsersService implements UsersService {

    private final UsersJpaRepository usersJpaRepository;

    public SimpleUsersService(UsersJpaRepository usersJpaRepository) {
        this.usersJpaRepository = usersJpaRepository;
    }

    @Override
    public Users findByEmailAndPassword(String email, String password) {
        return usersJpaRepository.findByEmailAndPassword(email, password);
    }

    @Override
    public Users save(Users users) {
        return usersJpaRepository.save(users);
    }
}

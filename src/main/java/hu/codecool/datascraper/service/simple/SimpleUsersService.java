package hu.codecool.datascraper.service.simple;

import hu.codecool.datascraper.entity.Users;
import hu.codecool.datascraper.jparepositroy.UsersRepository;
import hu.codecool.datascraper.service.UsersService;
import org.springframework.stereotype.Service;

@Service
public class SimpleUsersService implements UsersService {

    private final UsersRepository usersRepository;

    public SimpleUsersService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @Override
    public Users findByEmailAndPassword(String email, String password) {
        return usersRepository.findByEmailAndPassword(email, password);
    }

    @Override
    public Users save(Users users) {
        return usersRepository.save(users);
    }
}

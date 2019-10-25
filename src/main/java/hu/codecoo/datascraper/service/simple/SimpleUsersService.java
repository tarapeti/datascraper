package hu.codecoo.datascraper.service.simple;

import hu.codecoo.datascraper.entity.Users;
import hu.codecoo.datascraper.repository.UsersRepository;
import hu.codecoo.datascraper.service.UsersService;
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

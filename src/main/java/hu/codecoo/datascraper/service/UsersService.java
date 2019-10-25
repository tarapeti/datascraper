package hu.codecoo.datascraper.service;

import hu.codecoo.datascraper.entity.Users;

public interface UsersService {

    Users findByEmailAndPassword(String email, String password);
    Users save(Users users);
}

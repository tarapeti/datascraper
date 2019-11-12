package hu.codecool.datascraper.service;

import hu.codecool.datascraper.entity.Users;

public interface UsersService {

    Users findByEmailAndPassword(String email, String password);
    Users save(Users users);
}

package hu.codecoo.datascraper.controller;

import hu.codecoo.datascraper.entity.Users;
import hu.codecoo.datascraper.entity.Users;
import hu.codecoo.datascraper.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsersController {
    @Autowired
    private UsersService usersService;

    @GetMapping(path = "/getAllUsers")
    @ResponseBody
    List<Users> getAllUsers() {
        return null;
    }

    @PostMapping(path = "/addUsers")
    @ResponseBody
    void newUsers(@RequestBody Users users) {

    }
    @DeleteMapping(path = "/deleteUsers")
    public @ResponseBody
    void deleteUsers(@RequestParam int id) {

    }
}

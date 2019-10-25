package hu.codecoo.datascraper.controller;

import hu.codecoo.datascraper.entity.Users;
import hu.codecoo.datascraper.entity.Users;
import hu.codecoo.datascraper.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsersController {

    private UsersService usersService;

    public UsersController(UsersService usersService) {
        this.usersService = usersService;
    }

    @GetMapping(path = "/getAllUsers")
    @ResponseBody
    List<Users> getAllUsers() {
        return null;
    }

    @PostMapping(path = "/addUsers")
    @ResponseBody
    void newUsers(@RequestBody Users users) {

    }
    @PostMapping(path = "/login", consumes = "application/json", produces = "application/json")
    @ResponseBody
    void login(@RequestBody String email, String password){
        usersService.findByEmailAndPassword(email, password);
    }

    @DeleteMapping(path = "/deleteUsers")
    public @ResponseBody
    void deleteUsers(@RequestParam int id) {

    }
}

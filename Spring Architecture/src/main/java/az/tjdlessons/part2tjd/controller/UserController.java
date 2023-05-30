package az.tjdlessons.part2tjd.controller;

import az.tjdlessons.part2tjd.dto.User;
import az.tjdlessons.part2tjd.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(path = "/users/{userId}")
    public User getUserById(@PathVariable(name = "userId") Long userId) {
        return userService.getUserById(userId);
    }
}

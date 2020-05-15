package pl.coderslab.foodapp.controller;

import org.springframework.stereotype.Controller;
import pl.coderslab.foodapp.service.UserService;

@Controller
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
}

package pl.coderslab.foodapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import pl.coderslab.foodapp.entity.User;
import pl.coderslab.foodapp.repository.RestaurantRepository;
import pl.coderslab.foodapp.repository.UserRepository;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


@Controller
@SessionAttributes("user")
@RequestMapping("/deskop")
public class DeskopController {

    private final UserRepository userRepository;
    private final RestaurantRepository restaurantRepository;

    @Autowired
    public DeskopController(UserRepository userRepository, RestaurantRepository restaurantRepository) {
        this.userRepository = userRepository;
        this.restaurantRepository = restaurantRepository;
    }

    @ModelAttribute("username")
    public String userName(HttpServletRequest request) {
        try {
            User user = (User) request.getSession().getAttribute("user");
            return user.getUsername();
        } catch (NullPointerException e) {
            return "";
        }
    }
    @GetMapping("/fistpage")
    public String fistpage () {
        return "first-page";
    }

}

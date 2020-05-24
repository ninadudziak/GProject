package pl.coderslab.foodapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.foodapp.entity.Restaurant;
import pl.coderslab.foodapp.repository.RestaurantRepository;
import pl.coderslab.foodapp.repository.UserRepository;


@Controller
@RequestMapping(value = "/firstpage/restuarants")
public class RestaurantController {

    private final UserRepository userRepository;
    private final RestaurantRepository restaurantRepository;

    @Autowired
    public RestaurantController(final RestaurantRepository restaurantRepository, final UserRepository userRepository) {
        this.userRepository = userRepository;
        this.restaurantRepository = restaurantRepository;
    }

    @GetMapping("/add")
    public String addNewRestaurant(Model model) {
        model.addAttribute("restaurant", new Restaurant());
        return "restaurant-form";
    }

}

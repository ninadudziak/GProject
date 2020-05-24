package pl.coderslab.foodapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.foodapp.entity.User;
import pl.coderslab.foodapp.repository.UserRepository;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@SessionAttributes("user")
public class LoginController {

    private final UserRepository userRepository;

    @Autowired
    public LoginController(final UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @RequestMapping(value = {"/login"}, method = RequestMethod.GET)
    public String login() {
        return "login";
    }

    @PostMapping("/login")
    public String checkLogin(HttpServletRequest request, HttpServletResponse response, Model model) {
        String name = request.getParameter("username");
        String password = request.getParameter("password");

        //ciasteczko do zapmiętania:

        if (checkUser(name, password)) {
            Cookie cookie = new Cookie("user", name);
            cookie.setPath("/");
            response.addCookie(cookie);

            model.addAttribute("user", userRepository.findByUsername(name));
            return "redirect:/first-page";
        } else {
            model.addAttribute("errorMessage", "Błedny mail i/lub hasło");
            return "login";
        }
    }

    private boolean checkUser(String username, String password) {
        User user = userRepository.findByUsername(username);
        return user != null && BCrypt.checkpw(password, user.getPassword());
    }
}

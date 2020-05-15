package pl.coderslab.foodapp.service;

import pl.coderslab.foodapp.entity.User;

public interface UserService {

    User findByUserName(String name);

    void saveUser(User user);
}

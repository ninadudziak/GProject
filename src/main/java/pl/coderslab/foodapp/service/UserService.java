package pl.coderslab.foodapp.service;

import pl.coderslab.foodapp.entity.User;


public interface UserService {

        User findByUserName(String username);

        void saveUser(User user);

        void autoLogin(String username, String password);

        void deleteUserById(Long id);
}
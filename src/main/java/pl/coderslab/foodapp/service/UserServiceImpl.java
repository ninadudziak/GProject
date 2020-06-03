package pl.coderslab.foodapp.service;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import pl.coderslab.foodapp.entity.Role;
import pl.coderslab.foodapp.entity.User;
import pl.coderslab.foodapp.repository.RoleRepository;
import pl.coderslab.foodapp.repository.UserRepository;

import java.util.HashSet;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final BCryptPasswordEncoder passwordEncoder;

    public UserServiceImpl(UserRepository userRepository,
                           RoleRepository roleRepository,
                           BCryptPasswordEncoder passwordEncoder) {

        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public User findByUserName(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public void saveUser(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setEnabled(1);
        Role userRole = roleRepository.findByName("ROLE_USER");
        user.setRole(new HashSet<>(roleRepository.findAll()));
        userRepository.save(user);
    }

    @Override
    public void autoLogin(String username, String password) {

    }

    @Override
    public void deleteUserById(Long id) {
        userRepository.delete(userRepository.findUserById(id));
    }
}
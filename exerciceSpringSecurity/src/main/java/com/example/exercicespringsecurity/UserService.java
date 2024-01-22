package com.example.exercicespringsecurity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class UserService extends Throwable {
    private final UserRepository userRepository;
    private final RoleRepository roleRepository;

    @Autowired
    public UserService(UserRepository userRepository, RoleRepository roleRepository) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
    }
    public User saveUserWithAdminRole(User user){
        Role adminRole = roleRepository.findByName("ADMIN");
        user.getRoles().add(adminRole);
        return userRepository.save(user);
    }
    public User saveUserWithUserRole(User user){
        Role userRole = roleRepository.findByName("USER");
        user.getRoles().add(userRole);
        return userRepository.save(user);
    }
    public static User createAdminUser(String username, String password){
        User newUser = new User();
        newUser.setUsername(username);
        newUser.setPassword(password);
        saveUserWithAdminRole(newUser);
        return newUser;
    }
    public static User createUserUser(String username, String password){
        User newUser = new User();
        newUser.setUsername(username);
        newUser.setPassword(password);
        saveUserWithUserRole(newUser);
        return newUser;
    }
}

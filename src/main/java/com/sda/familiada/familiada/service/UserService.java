package com.sda.familiada.familiada.service;

import com.sda.familiada.familiada.model.User;
import com.sda.familiada.familiada.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Set<String> findAllUsers() {
        return userRepository.findAllUsers();
    }

    public void addUser(User user) {
        userRepository.save(user);
    }

}


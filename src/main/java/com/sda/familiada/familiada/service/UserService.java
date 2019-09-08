package com.sda.familiada.familiada.service;

import com.sda.familiada.familiada.model.User;
import com.sda.familiada.familiada.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void addUser(User user) {
        userRepository.save(user);
    }

    public List<User> getUserList() {
        List<User> showAllUsers = userRepository.findAll();
        return showAllUsers;
    }
}


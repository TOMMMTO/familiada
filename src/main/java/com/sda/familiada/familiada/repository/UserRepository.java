package com.sda.familiada.familiada.repository;

import com.sda.familiada.familiada.model.User;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

@Repository
public class UserRepository {

    private Set<User> users = initializeUsers();

    private Set<User> initializeUsers() {
        return new HashSet<>(Arrays.asList(new User("user", 0)));
    }

    public Set<String> findAllUsers() {
        return users.stream().map(User::getUsername).collect(Collectors.toSet());
    }

    public void save(User user) {
        users.add(user);


    }
}

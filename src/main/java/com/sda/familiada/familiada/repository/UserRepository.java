package com.sda.familiada.familiada.repository;

import com.sda.familiada.familiada.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {

}

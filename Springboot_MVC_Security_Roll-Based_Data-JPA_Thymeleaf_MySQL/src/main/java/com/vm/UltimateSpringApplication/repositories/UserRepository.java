package com.vm.UltimateSpringApplication.repositories;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

import com.vm.UltimateSpringApplication.entities.User;


/**
 * @author KedariTeja
 *
 */
public interface UserRepository extends JpaRepository<User, Integer>
{
    Optional<User> findByEmail(String email);
}
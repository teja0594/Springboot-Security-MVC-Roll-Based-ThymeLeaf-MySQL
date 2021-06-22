package com.vm.UltimateSpringApplication.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vm.UltimateSpringApplication.entities.Message;


/**
 * @author KedariTeja
 *
 */
public interface MessageRepository extends JpaRepository<Message, Integer>{

}
package com.springboot.repository;


import org.springframework.data.repository.CrudRepository;

import com.springboot.domain.Player;

public interface PlayerRepository extends CrudRepository<Player, Integer> {

}
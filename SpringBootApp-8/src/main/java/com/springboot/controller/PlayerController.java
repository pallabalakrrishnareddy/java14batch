package com.springboot.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.domain.Player;
import com.springboot.repository.PlayerRepository;

@RestController
@RequestMapping("cricket")
public class PlayerController {
	
	@Autowired
	PlayerRepository playerRepository;
	
	@PostMapping("saveplayer")
	public Player addPlayer(@RequestBody Player player) {
		
		return playerRepository.save(player);
		
	}
	
	@GetMapping("showall")
	List<Player> displayAll(){
		
		return (List<Player>) playerRepository.findAll();
		
	}
	
	@GetMapping("findId/{id}")
	public Optional<Player> findPlayer(@PathVariable int id) {
		Player p=null;
		
		Optional<Player> optional=playerRepository.findById(id);
		
		
		
		if(optional.isPresent()) {
			
			
			p=optional.get();
		}
		else
		p=null;
		//return optional;
		return optional;
		
		
		
	}

}
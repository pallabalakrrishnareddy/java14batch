package com.hcl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.entity.Laptop;
import com.hcl.repository.LapTopRepository;

@RestController
public class LaptopController {
	@Autowired
	LapTopRepository lrep;
	@PostMapping("/laptop/save")
	public Laptop saveData(@RequestBody Laptop l)
	{
		return lrep.save(l);
		
	}
	@GetMapping("/laptop/{name}")
	public List<Laptop> readData(@PathVariable String name)
	{
		return lrep.getAllRecords(name);
		
	}
}

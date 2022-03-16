package com.hcl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.entity.Brand;
import com.hcl.entity.Laptop;
import com.hcl.repository.BrandRepository;
import com.hcl.repository.LaptopRepository;
import com.hcl.request.LaptopRequest;

@RestController
public class LaptopController {
@Autowired
	LaptopRepository lrep;
@Autowired
BrandRepository brep;
@PostMapping("/hcllaptop/save")
public ResponseEntity<Laptop> saveData(@RequestBody LaptopRequest req)
{
	Brand b=new Brand();
	b.setBrandName(req.getBrand());
	b=brep.save(b);
	Laptop l=new Laptop(req);
	l.setBrand(b);
	l=lrep.save(l);
	return new ResponseEntity<Laptop>(l,HttpStatus.CREATED) ;
	
}
}

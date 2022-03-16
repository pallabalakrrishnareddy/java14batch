package com.hcl.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.entity.Laptop;

public interface LaptopRepository extends JpaRepository<Laptop, Long> {

}

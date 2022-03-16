package com.hcl.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.entity.Brand;

public interface BrandRepository extends JpaRepository<Brand, Long> {

}

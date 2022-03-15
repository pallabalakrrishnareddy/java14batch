package com.hcl.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.entity.Laptop;
@Repository
public interface LapTopRepository extends JpaRepository<Laptop,Long> {
List<Laptop>getAllRecords(String name);
}

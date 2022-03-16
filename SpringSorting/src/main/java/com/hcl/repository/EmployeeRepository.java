package com.hcl.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.hcl.domain.Employee;

public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Long> {

}

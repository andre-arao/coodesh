package com.example.repositories;

import com.example.model.Employees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployessRepository extends JpaRepository<Employees, Long> {
}

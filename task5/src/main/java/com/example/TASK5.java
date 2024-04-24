package com.example;

import com.example.dto.EmployeesDTO;
import com.example.model.Employees;
import com.example.repositories.EmployessRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Create an implementation of a Rest API .
 * Expose an API. Feel free to explore possibilities/functionalities/capabilities following Rest standard.
 * We suggest that your implementation have at least a CRUD scenario.
 *
 */
@RestController
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@RequestMapping(value = "/employees")
public class TASK5 {

    @Autowired
    private EmployessRepository repository;
    @GetMapping
    public List<Employees> listEmployees(){
        return repository.findAll();
    }

    @PostMapping
    public Employees createEmployees(EmployeesDTO employeesDTO) {

        Employees employees = new Employees();
        employees.setFirst_name(employeesDTO.first_name());
        employees.setLast_name(employeesDTO.last_name());
        employees.setGender(employeesDTO.gender());

        repository.save(employees);

        return employees;
    }

}

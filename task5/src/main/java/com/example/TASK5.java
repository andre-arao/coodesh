package com.example;

import com.example.dto.EmployeesDTO;
import com.example.model.Employees;
import com.example.repositories.EmployessRepository;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * Create an implementation of a Rest API .
 * Expose an API. Feel free to explore possibilities/functionalities/capabilities following Rest standard.
 * We suggest that your implementation have at least a CRUD scenario.
 *
 */
@RestController
@RequestMapping(value = "/employees")
public class TASK5 {

    @Autowired
    private EmployessRepository repository;
    @GetMapping
    public List<Employees> listEmployees(){
        return repository.findAll();
    }

    @Produces("application/json")
    @Consumes("application/json")
    @PostMapping
    public Employees createEmployees(@RequestBody EmployeesDTO employeesDTO) {

        Employees employees = new Employees();
        employees.setFirst_name(employeesDTO.first_name());
        employees.setLast_name(employeesDTO.last_name());
        employees.setGender(employeesDTO.gender());

        repository.save(employees);

        return employees;
    }

    @Produces("application/json")
    @Consumes("application/json")
    @PutMapping
    @Path("/{emp_no}")
    public Employees createEmployees(@PathParam(value = "emp_no") Long emp_no,
                                    @RequestBody EmployeesDTO employeesDTO) {

        Optional<Employees> optionalEmployees = repository.findById(emp_no);

        Employees employees = optionalEmployees.get();

        if (optionalEmployees.isPresent()) {

            employees.setFirst_name(employeesDTO.first_name());
            employees.setLast_name(employeesDTO.last_name());
            employees.setGender(employeesDTO.gender());

            repository.save(employees);

            return employees;

        }

        return employees;
    }

}

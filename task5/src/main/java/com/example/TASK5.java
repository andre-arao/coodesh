package com.example;

import com.example.dto.EmployeesDTO;
import com.example.model.Employees;
import com.example.repositories.EmployessRepository;
import jakarta.validation.ConstraintViolation;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<?> createEmployees(@RequestBody EmployeesDTO employeesDTO) {

        if (employeesDTO.first_name().isEmpty() || employeesDTO.last_name().isEmpty()){
            return ResponseEntity.badRequest().body("Os campos first_name e last_name não podem estar vazios.");
        }
        if (employeesDTO.gender().isEmpty() || !"F".equals(employeesDTO.gender()) && !"M".equals(employeesDTO.gender())) {
            return ResponseEntity.badRequest().body("O campo gender só pode conter a letra M ou F");
        }

        Employees employees = new Employees();
        employees.setFirst_name(employeesDTO.first_name());
        employees.setLast_name(employeesDTO.last_name());
        employees.setGender(employeesDTO.gender());

        repository.save(employees);

        return ResponseEntity.badRequest().body("Funcionário criado com sucesso!");
    }

    @Produces("application/json")
    @Consumes("application/json")
    @PutMapping
    @Path("/{emp_no}")
    public ResponseEntity<?> createEmployees(@PathParam(value = "emp_no") Long emp_no,
                                    @RequestBody EmployeesDTO employeesDTO) {

        if (employeesDTO.first_name().isEmpty() || employeesDTO.last_name().isEmpty()){
            return ResponseEntity.badRequest().body("Os campos first_name e last_name não podem estar vazios.");
        }
        if (employeesDTO.gender().isEmpty() || !"F".equals(employeesDTO.gender()) && !"M".equals(employeesDTO.gender())) {
            return ResponseEntity.badRequest().body("O campo gender só pode conter a letra M ou F");
        }

        Optional<Employees> optionalEmployees = repository.findById(emp_no);

        if (!optionalEmployees.isPresent()) {

            return ResponseEntity.badRequest().body("O funcionário com o emp_no: " + emp_no + " não existe:");

        }

        Employees employees = optionalEmployees.get();

        employees.setFirst_name(employeesDTO.first_name());
        employees.setLast_name(employeesDTO.last_name());
        employees.setGender(employeesDTO.gender());

        repository.save(employees);

        return ResponseEntity.badRequest().body("Funcionário atualizado com sucesso!");

    }

    @DeleteMapping
    @Path("/{emp_no}")
    public ResponseEntity<?> createEmployees(@PathParam(value = "emp_no") Long emp_no) {

        Optional<Employees> optionalEmployees = repository.findById(emp_no);

        if (!optionalEmployees.isPresent()) {

            return ResponseEntity.badRequest().body("O funcionário com o emp_no: " + emp_no + " não existe:");

        }

        repository.deleteById(emp_no);

        return ResponseEntity.badRequest().body("Funcionário excluido com sucesso!");
    }

}

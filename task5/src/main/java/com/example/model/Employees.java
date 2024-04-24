package com.example.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
@Entity
//@Table(name = "result_test_guilherme")
//@Table(name = "result_tests_mayk")
@Table(name = "employees")
public class Employees {

    @Column(name = "emp_no")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long emp_no;
    @Column(name = "first_name")
    @NotBlank(message = "first_name é obrigatório")
    private String first_name;
    @Column(name = "last_name")
    @NotBlank(message = "last_name é obrigatório")
    private String last_name;
    @NotBlank(message = "gender é obrigatório")
    @Column(name = "gender")
    private String gender;

    public Long getEmp_no() {
        return emp_no;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}

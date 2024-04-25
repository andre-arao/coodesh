package com.example.dto;

import jakarta.validation.constraints.NotBlank;

public record EmployeesDTO(@NotBlank(message = "first_name é obrigatório")String first_name, @NotBlank(message = "last_name é obrigatório")String last_name, @NotBlank(message = "gender é obrigatório")String gender) {
}

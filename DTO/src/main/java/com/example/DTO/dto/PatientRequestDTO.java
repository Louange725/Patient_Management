package com.example.DTO.Project.dto;

import jakarta.validation.constraints.*;


public record PatientRequestDTO(

        @NotBlank(message = "Full name is required")
        @Size(max = 100, message = "Full name must be at most 100 characters")
        String fullName,

        @NotBlank(message = "Email is required")
        @Email(message = "Invalid email address")
        String email,

        @NotBlank(message = "Phone is required")
        @Size(min = 10, max = 13, message = "Phone must be 10 to 13 characters")
        String phone,

        @NotNull(message = "Age is required")
        @Min(value = 0, message = "Age cannot be negative")
        @Max(value = 120, message = "Age must be at most 120")
        Integer age,

        @NotBlank(message = "National ID is required")
        @Size(min = 16, max = 16, message = "National ID must be exactly 16 characters")
        String nationalId,

        @Size(max = 500, message = "Medical notes must be at most 500 characters")
        String medicalNotes          
) {
}
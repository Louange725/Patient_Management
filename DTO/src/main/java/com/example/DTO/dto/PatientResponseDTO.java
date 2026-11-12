package com.example.DTO.Project.dto;


public record PatientResponseDTO(
        Long id,
        String fullName,
        String email,
        String phone,
        Integer age
) {
}
package com.cl.mysqldemo.dto;

import com.cl.mysqldemo.entities.Student;
import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
public class StudentDTO {

    private Long studentId;
    private String studentName;
    private String gender;

    public static StudentDTO convertToDTO(Student entity) {

        StudentDTO dto = StudentDTO.builder()
                .studentId(entity.getId())
                .studentName(entity.getName())
                .gender(entity.getGender())
                .build();

        return dto;
    }

    public static List<StudentDTO> convertToDTO(List<Student> entityList) {

        List<StudentDTO> dtos = new ArrayList<>();

        for (Student s : entityList) {
            dtos.add(convertToDTO(s));
        }

        return dtos;
    }
}
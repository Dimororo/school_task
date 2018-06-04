package com.school.model.dto;

import com.school.model.enity.Class;
import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class StudentDTO {
    private String firstName;
    private String lastName;
    private Class studentClass;
}

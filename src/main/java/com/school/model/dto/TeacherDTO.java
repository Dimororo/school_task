package com.school.model.dto;

import com.school.model.enity.Class;
import lombok.*;
import java.util.Set;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class TeacherDTO {
    private String firstName;
    private String lastName;
    private Class teacherClass;
    private Set<Class> lessonsClass;
}

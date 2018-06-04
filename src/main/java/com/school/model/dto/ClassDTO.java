package com.school.model.dto;

import com.school.model.enity.Student;
import com.school.model.enity.Teacher;
import lombok.*;

import java.util.Set;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ClassDTO {
    private String className;
    private Teacher classTeacher;
    private Set<Student> students;
    private Set<Teacher> lessonsTeacher;

}

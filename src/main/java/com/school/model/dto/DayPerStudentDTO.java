package com.school.model.dto;

import com.school.model.enity.DayMetadata;
import com.school.model.enity.LessonPerStudent;
import com.school.model.enity.Student;
import lombok.*;

import java.util.Set;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class DayPerStudentDTO {
    private Student student;
    private DayMetadata dayMetadata;
    private Set<LessonPerStudent> lessonPerStudents;
}

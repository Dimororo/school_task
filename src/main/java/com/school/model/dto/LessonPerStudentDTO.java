package com.school.model.dto;

import com.school.model.enity.DayPerStudent;
import com.school.model.enity.LessonMetadata;
import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class LessonPerStudentDTO {
    private LessonMetadata lessonMetadata;
    private DayPerStudent dayPerStudent;
    private String hometask;
    private int homeMark;
    private int classMark;
    private boolean isAvaible;
}

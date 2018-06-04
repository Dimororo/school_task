package com.school.model.dto;

import com.school.model.enity.DayMetadata;
import com.school.model.enity.LessonPerStudent;
import lombok.*;

import java.util.Set;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class LessonMetadataDTO {
    private int point;
    private DayMetadata dayMetadata;
    private Set<LessonPerStudent> lessonPerStudents;
}

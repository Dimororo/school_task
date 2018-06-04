package com.school.model.dto;

import com.school.model.enity.DayPerStudent;
import com.school.model.enity.LessonMetadata;
import lombok.*;

import java.time.DayOfWeek;
import java.util.Set;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class DayMetadataDTO {
    private DayOfWeek dayOfWeek;
    private Set<LessonMetadata> lessonMetadatas;
    private Set<DayPerStudent>  dayPerStudents;
}

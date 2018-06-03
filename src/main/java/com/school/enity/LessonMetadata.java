package com.school.enity;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Set;
import java.util.UUID;

/**
 * Created by Sergey on 03.06.2018.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(exclude = "dayMetadata")
@ToString(exclude = "dayMetadata")
@Entity
@Table(name = "Class")
public class LessonMetadata {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    @Column(name = "UUID")
    private UUID lessonMetadataId;

    @Column(name = "Point")
    private int point;

    @Column(name = "Day_Metadata")
    private DayMetadata dayMetadata;

    @Column(name = "Lesson_Per_Student")
    private Set<LessonPerStudent> lessonPerStudents;
}

package com.school.model.enity;

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
@Table(name = "Lesson_Metadata")
public class LessonMetadata {

    @Id
    @GenericGenerator(name = "uuid-gen", strategy = "uuid2")
    @GeneratedValue(generator = "uuid-gen")
    @Column(name = "Lesson_Metadata_UUID")
    private UUID lessonMetadataId;

    @Column(name = "Point")
    private int point;

    @ManyToOne
    @JoinColumn(name = "Day_Metadata_UUID")
    @Column(name = "Day_Metadata")
    private DayMetadata dayMetadata;

    @OneToMany
    @JoinColumn(name = "Lesson_Per_Student_UUID")
    @Column(name = "Lesson_Per_Student")
    private Set<LessonPerStudent> lessonPerStudents;
}

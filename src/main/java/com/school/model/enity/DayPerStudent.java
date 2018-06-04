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
@EqualsAndHashCode()
@ToString()
@Entity
@Table(name = "Class")
public class DayPerStudent {

    @Id
    @GenericGenerator(name = "uuid-gen", strategy = "uuid2")
    @GeneratedValue(generator = "uuid-gen")
    @Column(name = "UUID")
    private UUID dayPerStudentId;

    @OneToOne
    @Column(name = "Student")
    private Student student;

    @Column(name = "Dat_Metadata")
    private DayMetadata dayMetadata;

    @Column(name = "Lesson_Per_Students")
    private Set<LessonPerStudent> lessonPerStudents;
}

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
@Table(name = "Day_Per_Student")
public class DayPerStudent {

    @Id
    @GenericGenerator(name = "uuid-gen", strategy = "uuid2")
    @GeneratedValue(generator = "uuid-gen")
    @Column(name = "Day_Per_Student_UUID")
    private UUID dayPerStudentId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Student_UUID")
    @Column(name = "Student")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "Day_Metadata_UUID")
    @Column(name = "Day_Metadata")
    private DayMetadata dayMetadata;

    @OneToMany
    @JoinColumn(name = "Lesson_Per_Student_UUID")
    @Column(name = "Lesson_Per_Student")
    private Set<LessonPerStudent> lessonPerStudents;
}

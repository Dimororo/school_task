package com.school.model.enity;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
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
@Table(name = "Lesson_Per_Student")
public class LessonPerStudent {

    @Id
    @GenericGenerator(name = "uuid-gen", strategy = "uuid2")
    @GeneratedValue(generator = "uuid-gen")
    @Column(name = "Lesson_Per_Student_UUID")
    private UUID lessonPerStudentID;

    @ManyToOne
    @JoinColumn(name = "Lesson_Metadata_UUID")
    @Column(name = "Lesson_Metadata")
    private LessonMetadata lessonMetadata;

    @ManyToOne
    @JoinColumn(name = "Day_Per_Student_UUID")
    @Column(name = "Day_Per_Student")
    private DayPerStudent dayPerStudent;

    @Column(name = "Hometask")
    private String hometask;

    @Column(name = "Home_Mark")
    private int homeMark;

    @Column(name = "Class_Mark")
    private int classMark;

    @Column(name = "Is_Avaible")
    private boolean isAvaible;
}

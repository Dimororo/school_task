package com.school.enity;

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
@Table(name = "Class")
public class LessonPerStudent {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    @Column(name = "UUID")
    private UUID lessonPerStudentID;

    private LessonMetadata lessonMetadata;

    private DayPerStudent dayPerStudent;

    private String hometask;

    private int homeMark;

    private int classMark;

    private boolean isAvaible;
}

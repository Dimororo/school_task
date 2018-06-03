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
@EqualsAndHashCode(exclude = {"lessonsTeacher"})
@ToString(exclude = {"lessonsTeacher"})
@Entity
@Table(name = "Class")
public class Class {

    @Id
    @GenericGenerator(name = "uuid-gen", strategy = "uuid2")
    @GeneratedValue(generator = "uuid-gen")
    @Column(name = "UUID")
    private UUID classId;

    @Column(name = "Class_Name")
    private String className;

    @Column(name = "ClassTeacher")
    private Teacher classTeacher;

    @Column(name = "Student")
    private Set<Student> students;

    @Column(name = "Lessons_Teacher")
    private Set<Teacher> lessonsTeacher;
}

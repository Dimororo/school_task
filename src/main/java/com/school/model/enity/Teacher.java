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
@EqualsAndHashCode(exclude = "lessonsClass")
@ToString(exclude = "lessonsClass")
@Entity
@Table(name = "Teacher")
public class Teacher {

    @Id
    @GenericGenerator(name = "uuid-gen", strategy = "uuid2")
    @GeneratedValue(generator = "uuid-gen")
    @Column(name = "Teacher_UUID")
    private UUID teacherId;

    @Column(name = "First_Name")
    private String firstName;

    @Column(name = "Last_Name")
    private String lastName;

    @Column(name = "Teacher_Class")
    private Class teacherClass;

    @OneToMany
    @JoinColumn(name = "Class_UUID")
    @Column(name = "Class")
    private Set<Class> lessonsClass;
}

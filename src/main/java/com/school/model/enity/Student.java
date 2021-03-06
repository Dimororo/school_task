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
@EqualsAndHashCode(exclude = {"studentClass"})
@ToString(exclude = {"studentClass"})
@Entity
@Table(name = "Student")
public class Student {

    @Id
    @GenericGenerator(name = "uuid-gen", strategy = "uuid2")
    @GeneratedValue(generator = "uuid-gen")
    @Column(name = "Student_UUID")
    private UUID studentId;

    @Column(name = "First_Name")
    private String firstName;

    @Column(name = "Last_Name")
    private String lastName;

    @OneToOne
    @JoinColumn(name = "Class_UUID")
    @Column(name = "Class")
    private Class studentClass;

    @OneToMany
    @JoinColumn(name = "Day_Per_Student_UUID")
    @Column(name = "Day_Per_Student")
    private Set<DayPerStudent> dayPerStudents;

}

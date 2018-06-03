package com.school.enity;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.DayOfWeek;
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
public class DayMetadata {

    @Id
    @GenericGenerator(name = "uuid-gen", strategy = "uuid2")
    @GeneratedValue(generator = "uuid-gen")
    @Column(name = "UUID")
    private UUID dayMetadataId;

    @Column(name = "Day_Of_Week")
    private DayOfWeek dayOfWeek;

    @Column(name="Lessons_Metadata")
    private Set<LessonMetadata> lessonMetadatas;

    @Column(name = "Day_Pes_Student")
    private Set<DayPerStudent>  dayPerStudents;

}

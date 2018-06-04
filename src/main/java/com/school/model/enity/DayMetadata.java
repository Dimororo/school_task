package com.school.model.enity;

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
@Table(name = "Day_Metadata")
public class DayMetadata {

    @Id
    @GenericGenerator(name = "uuid-gen", strategy = "uuid2")
    @GeneratedValue(generator = "uuid-gen")
    @Column(name = "Day_Metadata_UUID")
    private UUID dayMetadataId;

    @Column(name = "Day_Of_Week")
    private DayOfWeek dayOfWeek;

    @OneToMany
    @JoinColumn(name = "Lesson_Metadata_UUID")
    @Column(name="Lessons_Metadata")
    private Set<LessonMetadata> lessonMetadatas;

    @OneToMany
    @JoinColumn(name = "Day_Per_Student_UUID")
    @Column(name = "Day_Pes_Student")
    private Set<DayPerStudent>  dayPerStudents;

}

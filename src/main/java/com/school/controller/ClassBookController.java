package com.school.controller;

import com.school.model.dto.StudentDTO;
import com.school.model.enity.Class;
import com.school.repositories.ClassRepository;
import com.school.repositories.LessonMetadataRepository;
import com.school.repositories.LessonPerStudentRepository;
import com.school.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.UUID;

@Controller
public class ClassBookController {

    ClassRepository classRepository;
    LessonPerStudentRepository lessonPerStudentRepository;
    LessonMetadataRepository lessonMetadataRepository;
    StudentRepository studentRepository;

    @Autowired
    public ClassBookController(
            ClassRepository classRepository,
            LessonPerStudentRepository lessonPerStudentRepository,
            LessonMetadataRepository lessonMetadataRepository,
            StudentRepository studentRepository){
        this.classRepository = classRepository;
        this.lessonPerStudentRepository = lessonPerStudentRepository;
        this.lessonMetadataRepository = lessonMetadataRepository;
        this.studentRepository = studentRepository;
    }

    @RequestMapping(value = "/saveStudent", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.OK)
    public void saveMessageToCache(@RequestBody StudentDTO student) {
        studentRepository.save(null);
    }
}

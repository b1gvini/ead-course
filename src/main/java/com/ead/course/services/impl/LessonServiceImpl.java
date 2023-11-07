package com.ead.course.services.impl;

import com.ead.course.repositories.LessonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LessonServiceImpl {

    @Autowired
    LessonRepository lessonRepository;
}

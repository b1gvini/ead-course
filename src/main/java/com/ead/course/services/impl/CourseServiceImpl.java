package com.ead.course.services.impl;

import com.ead.course.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl {

    @Autowired
    CourseRepository courseRepository;
}

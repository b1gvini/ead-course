package com.ead.course.services.impl;

import com.ead.course.repositories.ModuleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ModuleServiceImpl {

    @Autowired
    ModuleRepository moduleRepository;
}

package com.spring.web.service.impl;

import com.spring.web.dao.CourseDAO;
import com.spring.web.entity.CourseVO;
import com.spring.web.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class CourseServiceImpl implements CourseService {
    @Resource
    private CourseDAO CourseDAO;

    @Override
    public List<CourseVO> selectCurrentCourses() {
        return CourseDAO.selectCurrentCourses();
    }
}
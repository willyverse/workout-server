package com.demo.workout.service;

import com.demo.workout.dao.HelloDao;
import com.demo.workout.dto.HelloDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HelloService {

    @Autowired
    private HelloDao helloDao;

    public List<HelloDto> hello() {
        return helloDao.hello();
    }
}

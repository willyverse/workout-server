package com.demo.workout.dao;

import com.demo.workout.dto.HelloDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public class HelloDao {

    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    public List<HelloDto> hello() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        return sqlSession.selectList("com.demo.workout.selectList");
    }
}

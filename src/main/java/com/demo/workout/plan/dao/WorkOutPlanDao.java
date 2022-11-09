package com.demo.workout.plan.dao;

import com.demo.workout.plan.dto.WorkOutPlanDto;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class WorkOutPlanDao {

    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    private String namespace = "com.demo.workout.plan.dao.";

    public List<WorkOutPlanDto> getWorkOutPlan(WorkOutPlanDto workOutPlanDto) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        return sqlSession.selectList(namespace + "getWorkOutPlan", workOutPlanDto);
    }
}

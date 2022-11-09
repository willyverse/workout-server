package com.demo.workout.plan.service;

import com.demo.workout.plan.dao.WorkOutPlanDao;
import com.demo.workout.plan.dto.WorkOutPlanDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkOutPlanService {

    @Autowired
    WorkOutPlanDao workOutPlanDao;

    public List<WorkOutPlanDto> getWorkOutPlan(WorkOutPlanDto workOutPlanDto) {
        return workOutPlanDao.getWorkOutPlan(workOutPlanDto);
    }
}

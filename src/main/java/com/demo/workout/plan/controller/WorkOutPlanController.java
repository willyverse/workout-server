package com.demo.workout.plan.controller;

import com.demo.workout.plan.dto.WorkOutPlanDto;
import com.demo.workout.plan.service.WorkOutPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/plan")
public class WorkOutPlanController {

    @Autowired
    WorkOutPlanService workOutPlanService;

    @GetMapping("/getWorkOutPlan")
    public Map<String, Object> getWorkOutPlan(WorkOutPlanDto workoutPlanDto) {

        Map<String, Object> resultMap = new HashMap<>();
        String resultCd = "";
        String errorMsg = "";

        try {
            List<WorkOutPlanDto> workOutPlanList = workOutPlanService.getWorkOutPlan(workoutPlanDto);
            resultCd = "success";
            resultMap.put("resultCd", resultCd);
            resultMap.put("workOutPlanList", workOutPlanList);
        } catch(Exception e) {
            resultCd = "error";
            errorMsg = "에러가 발생했음: " + e.getMessage();
            resultMap.put("resultCd", resultCd);
            resultMap.put("errorMsg", errorMsg);
        }

        return resultMap;
    }
}

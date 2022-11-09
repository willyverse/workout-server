package com.demo.workout.plan.dto;

import lombok.Data;

@Data
public class WorkOutPlanDto {
    private String  userId;
    private String  workOutDate;
    private Integer roundNum;
    private Integer roundOrd;
    private String  workOutId;
    private Integer setNum;
    private Integer workOutSec;
    private Integer restSec;
}

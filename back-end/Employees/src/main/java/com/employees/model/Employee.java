package com.employees.model;

import com.employees.enums.Contract;
import com.employees.enums.Department;
import com.employees.enums.Job;

import java.util.Date;

public class Employee {

    private int employeeId;

    private int employeeCode;

    private String employeeName;

    private Date birthDate;

    private String birthCity;

    private String directManager;

    private Department department;

    private Job jobTitle;

    private Contract contractType;

}

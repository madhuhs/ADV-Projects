package com.jspiders.ems.util;

import com.jspiders.ems.data.EmployeDTO;

public class EmployeeDtoValidator {

    public static void validate(EmployeDTO empDto)
    {
        String name = empDto.getName();
        validateName(name);

        String job = empDto.getJob();
        validateJob(job);

    }

    public static void validateJob(String job) {

    }

    public static void validateName(String name)
    {
        if(name.length() < 3 || name.length() > 45)
        {
            System.err.println("VALIDATION FOR NAME FAILED");
            throw new IllegalArgumentException("Name should be min-3 or max-45 chars");
        }
    }
}

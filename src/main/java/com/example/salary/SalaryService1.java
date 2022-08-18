package com.example.salary;

import java.util.List;
import java.util.Map;

public interface SalaryService1 {
    int maxSalary(Integer departmentId);
    int minSalary (Integer departmentId);

    List <Employee>  allDep (Integer departmentId);
    Map<Integer, List <Employee>>  all ();

}

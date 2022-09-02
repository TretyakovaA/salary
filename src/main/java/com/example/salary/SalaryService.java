package com.example.salary;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class SalaryService {
    private static int limit = 10;
    private final List <Employee> employees;

    public SalaryService(List<Employee> employees) {
        this.employees = new ArrayList<>();
    }

    public Employee findEmployee (String firstName, String lastName){
        Employee employee = new Employee(firstName,lastName);
        if(!employees.contains(employee)){

        }
        return employee;
    }
     public  Employee addEmployee (String firstName, String lastName) throws BadRequestException {
         Employee employee = new Employee(firstName, lastName);
         if ((!StringUtils.isAlpha(firstName)) && (!StringUtils.isAlpha(lastName)))

             throw new BadRequestException();
    return new Employee (StringUtils.capitalize(firstName.toLowerCase()), StringUtils.capitalize(lastName.toLowerCase()));
     }
    public Employee deleteEmployee(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        if (employees.contains(employee)) {
            employees.remove(employee);

        }
        return employee;

    }

}

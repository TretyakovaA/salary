package com.example.salary;

import org.springframework.stereotype.Service;
import java.util.*;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class SalaryServiceImple implements SalaryService1 {

        private List <Employee> employees = new ArrayList<>(Arrays.asList(
        new Employee("Ivanov", 9000, 10),
        new Employee("Petrov", 15000, 11),
        new Employee("Alex", 12000, 10),
        new Employee("Fedorov", 14000, 10),
        new Employee("Krasnov", 14000, 11),
        new Employee("Ivanov", 9000, 10)));

        public int maxSalary(Integer departmentId){
            
            return employees.stream()
                    .filter(e -> e.getDepartmentNumber().equals(departmentId))
                    .map(Employee::getSalaryStaff).max(Comparator.naturalOrder()).get();
        }
    public int minSalary(Integer departmentId){

        return employees.stream()
                .filter(e -> e.getDepartmentNumber().equals(departmentId))
                .map(Employee::getSalaryStaff).min(Comparator.naturalOrder()).get();
    }

    public List<Employee> allDep(Integer department) {
        return employees.stream()
                .filter(e -> e.getDepartmentNumber().equals(department))
                .collect(Collectors.toList());
    }
    public Map<Integer,List<Employee>> all() {

        Map<Integer, List<Employee>> employeesByDep = employees
                .stream()
                .collect(Collectors.groupingBy(Employee::getDepartmentNumber));

        return employeesByDep;
    }
}

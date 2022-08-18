package com.example.salary;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/departments")
public class SalaryController {
    private final SalaryServiceImple salaryServiceImple;

    public SalaryController(SalaryServiceImple salaryServiceImple) {
        this.salaryServiceImple = salaryServiceImple;
    }

    @GetMapping(path = "/max-salary")
    public int maxSalary(Integer departmentId) {
        return salaryServiceImple.maxSalary(departmentId);
    }
    @GetMapping(path = "/min-salary")
    public int minSalary(Integer departmentId) {
        return salaryServiceImple.minSalary(departmentId);
    }
    @GetMapping(path = "/allDep")
    public  List <Employee> allDep ( Integer departmentId)  {

           return salaryServiceImple.allDep(departmentId);
    }
    @GetMapping(path = "/all")
    public Map<Integer, List <Employee>> all ()  {

        return salaryServiceImple.all();
    }

}

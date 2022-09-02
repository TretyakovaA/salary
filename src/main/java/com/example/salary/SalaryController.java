package com.example.salary;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/employee")

public class SalaryController {

    private final SalaryService salaryService;

    public SalaryController(SalaryService salaryService) {

        this.salaryService = salaryService;
    }

    @GetMapping("/find")
    public Employee findEmployee(String firstname, String lastname) {

        return salaryService.findEmployee(firstname, lastname);
    }

    @GetMapping(path = "/add")
    public Employee addEmployee(String firstname, String lastname) {
        return salaryService.addEmployee(firstname, lastname);
    }

    @GetMapping(path = "/delete")
    public Employee deleteEmployee(String firstname, String lastname) {

        return salaryService.deleteEmployee(firstname, lastname);

    }

}


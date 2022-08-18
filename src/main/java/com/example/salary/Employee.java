package com.example.salary;

import java.util.Objects;

public class Employee {
    private String fio;
    private int salaryStaff;
    private Integer departmentNumber;


    public Employee(String fio, int salaryStaff, Integer departmentNumber) {
        this.fio = fio;
        this.salaryStaff = salaryStaff;
        this.departmentNumber = departmentNumber;

    }

    public String getFio() {
        return fio;
    }


    public int getSalaryStaff() {
        return salaryStaff;
    }

    public Integer getDepartmentNumber() {
        return departmentNumber;
    }

    public void setSalaryStaff(int salaryStaff) {
        this.salaryStaff = salaryStaff;
    }

    public void setDepartmentNumber(Integer departmentNumber) {
        this.departmentNumber = departmentNumber;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "fio='" + fio + '\'' +
                ", salaryStaff=" + salaryStaff +
                ", departmentNumber=" + departmentNumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return salaryStaff == employee.salaryStaff && fio.equals(employee.fio) && departmentNumber.equals(employee.departmentNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fio, salaryStaff, departmentNumber);
    }
}

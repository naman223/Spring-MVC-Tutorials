package com.dailycodebuffer.spring.function;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    private String empId;
    private String empname;
    private String email;

    @Override
    public String toString() {
        return "Employee{" +
                "empId='" + empId + '\'' +
                ", empname='" + empname + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

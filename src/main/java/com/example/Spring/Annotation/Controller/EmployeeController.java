package com.example.Spring.Annotation.Controller;

import com.example.Spring.Annotation.Entity.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController //@Controller+ @Response Body
public class EmployeeController {


    @GetMapping("/getEmployee")
    public String getEmployee() {
        return "employee";
    }
    @GetMapping("/getEmployee")
    public String getEmployeeID(@RequestParam Integer employeeId) {
        return "employee";
    }

    @PostMapping("/getEmployee")
    public String addEmployee(Employee employee) {
        return "added";
    }

    @PutMapping("/getEmployee")
    public String updateEmployee(Employee employee) {
        return "updated";
    }
    @DeleteMapping
    public String DeleteEmployee(Employee employee) {
        return "deleted";
    }
}



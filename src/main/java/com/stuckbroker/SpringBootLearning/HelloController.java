package com.stuckbroker.SpringBootLearning;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "Hello World!";
    }

    @RequestMapping("/")
    public List<Employee> getEmployees()
    {
        List<Employee> employeesList = new ArrayList<Employee>();
        employeesList.add(new Employee(1,"lokesh","gupta","howtodoinjava@gmail.com"));
        return employeesList;
    }
}

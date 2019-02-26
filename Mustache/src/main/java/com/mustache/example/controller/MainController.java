package com.mustache.example.controller;

import com.mustache.example.dao.EmployeeDAO;
import com.mustache.example.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    private EmployeeDAO employeeDAO;


    @RequestMapping("/")
    public String handleRequest(Model model) {

        List<Employee> employees = employeeDAO.getEmployees();
        model.addAttribute("employees", employees);
        return "employee";
    }

}
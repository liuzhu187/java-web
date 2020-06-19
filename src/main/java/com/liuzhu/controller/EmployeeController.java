package com.liuzhu.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.liuzhu.pojo.Employee;
import com.liuzhu.service.EmployeeService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @ClassName EmployeeController
 * @Deacription TODO
 * @Author liuzhu
 * @Date 2020/4/19 16:35
 * @Version 1.0
 **/
@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService service;

    @RequestMapping("/emps")
    public String getEmps(Model model) {
        List<Employee> emps = service.getEmps();
        model.addAttribute("lists",emps);
        return "list";
    }
    @RequestMapping("/updateEmp")
    public String updateEmp(@Param("e_id") int e_id,Model model){
        Employee emp = service.getEmpById(e_id);
        model.addAttribute("emp",emp);
        return "updateEmp";
    }
    @RequestMapping("/update")
    public String update(Employee employee){
        service.updateById(employee);
        return "redirect:/emps";
    }
    @RequestMapping("/deleteEmp")
    public String deleteEmpById(@RequestParam("e_id") int id){
        service.deleteById(id);
        return "redirect:/emps";
    }
    @RequestMapping("/addEmp")
    public String addEmp(){
        return "addEmp";
    }
    @RequestMapping("/add")
    public String add(Employee employee){
        service.addEmp(employee);
        return "redirect:/emps";
    }
}

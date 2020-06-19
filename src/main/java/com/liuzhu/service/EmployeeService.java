package com.liuzhu.service;

import com.liuzhu.pojo.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ClassName EmployeeService
 * @Deacription TODO
 * @Author liuzhu
 * @Date 2020/4/19 16:43
 * @Version 1.0
 **/
public interface EmployeeService {
    List<Employee> getEmps();
    int deleteById(int id);
    int updateById(Employee employee);
    Employee getEmpById(int e_id);
    int addEmp(Employee employee);
}

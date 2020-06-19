package com.liuzhu.dao;

import com.liuzhu.pojo.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ClassName EmployeeMapper
 * @Deacription TODO
 * @Author liuzhu
 * @Date 2020/4/19 16:45
 * @Version 1.0
 **/
public interface EmployeeMapper {
    List<Employee> getEmps();
    int deleteById(@Param("emp_id") int id);
    int updateById(Employee employee);
    Employee getEmpById(@Param("emp_id") int e_id);
    int addEmp(Employee employee);
}

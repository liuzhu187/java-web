package com.liuzhu.service;

import com.liuzhu.dao.EmployeeMapper;
import com.liuzhu.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName EmployeeServiceImpl
 * @Deacription TODO
 * @Author liuzhu
 * @Date 2020/4/19 16:44
 * @Version 1.0
 **/
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeMapper mapper;
    public List<Employee> getEmps() {
        return mapper.getEmps();
    }
    public int deleteById(int id) {
        return mapper.deleteById(id);
    }
    public int updateById(Employee employee) {
        return mapper.updateById(employee);
    }
    public Employee getEmpById(int e_id) {
        return mapper.getEmpById(e_id);
    }

    public int addEmp(Employee employee) {
        return mapper.addEmp(employee);
    }
}

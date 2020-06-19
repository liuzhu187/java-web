package com.liuzhu.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @ClassName Employee
 * @Deacription TODO
 * @Author liuzhu
 * @Date 2020/4/19 16:29
 * @Version 1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee {
    private int emp_id;
    private String emp_name;
    private char gender;
    private String email;
    private int d_id;
}

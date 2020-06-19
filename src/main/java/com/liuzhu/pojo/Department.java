package com.liuzhu.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @ClassName Department
 * @Deacription TODO
 * @Author liuzhu
 * @Date 2020/4/19 16:28
 * @Version 1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Department {
    private int dept_id;
    private String dept_name;
}

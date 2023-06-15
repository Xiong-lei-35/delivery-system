package edu.czjt.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import edu.czjt.reggie.entity.Employee;
import edu.czjt.reggie.mapper.EmployeeMapper;
import edu.czjt.reggie.service.EmployeeService;
import org.springframework.stereotype.Service;


/**
 *@Author zhang_bingru20855066
 *@Date 2023/6/15 17:57
*/

@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {
  
}

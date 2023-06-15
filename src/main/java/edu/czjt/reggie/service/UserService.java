package edu.czjt.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import edu.czjt.reggie.entity.User;

/**
 *@Author zhang_bingru20855066
 *@Date 2023/6/15 17:57
*/

//这是一个Java接口，名为UserService，继承自IService<User>接口。
//IService接口定义了一些通用的增删改查操作，而UserService则是IService的具体实现
//这里的<User>，指定了IService和UserService操作的实体类是User

public interface UserService extends IService<User> {
  
}

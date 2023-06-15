package edu.czjt.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import edu.czjt.reggie.entity.SetmealDish;

/**
 *@Author zhang_bingru20855066
 *@Date 2023/6/15 17:57
*/


//这是一个Java接口，名为SetmealDishService，继承自IService<SetmealDish>。
//IService是一个泛型接口，它定义了一些通用的服务接口方法，如增删改查等。
//SetmealDish是一个实体类，表示套餐菜品
//SetmealDishService可以理解为套餐菜品服务接口，提供了对套餐菜品的增删改查等操作。
public interface SetmealDishService extends IService<SetmealDish> {
  
}

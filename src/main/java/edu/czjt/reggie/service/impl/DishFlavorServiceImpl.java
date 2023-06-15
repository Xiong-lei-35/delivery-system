package edu.czjt.reggie.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import edu.czjt.reggie.entity.DishFlavor;
import edu.czjt.reggie.mapper.DishFlavorMapper;
import edu.czjt.reggie.service.DishFlavorService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *@Author zhang_bingru20855066
 *@Date 2023/6/15 17:57
*/

@Service
public class DishFlavorServiceImpl extends ServiceImpl<DishFlavorMapper, DishFlavor> implements DishFlavorService {
    //实现了DishFlavorService接口，继承了ServiceImpl类
    //DishFlavor表示菜品口味，DishFlavorService是对菜品口味进行操作的服务接口
    //ServiceImpl可以简化Service层的代码编写。
    @Override
    public List<DishFlavor> getFlavorsByDishId(Long dishId) {
        LambdaQueryWrapper<DishFlavor> dishFlavorLambdaQueryWrapper = new LambdaQueryWrapper<>();
        dishFlavorLambdaQueryWrapper.eq(DishFlavor::getDishId, dishId);
        return this.list(dishFlavorLambdaQueryWrapper);
    }

    @Override
    public boolean removeByDishId(Long dishId) {
        LambdaQueryWrapper<DishFlavor> dishFlavorLambdaQueryWrapper = new LambdaQueryWrapper<>();
        dishFlavorLambdaQueryWrapper.eq(DishFlavor::getDishId, dishId);
        return this.remove(dishFlavorLambdaQueryWrapper);
    }
    
}

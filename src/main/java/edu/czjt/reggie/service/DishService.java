package edu.czjt.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import edu.czjt.reggie.dto.DishDto;
import edu.czjt.reggie.entity.Dish;

/**
 *@Author zhang_bingru20855066
 *@Date 2023/6/15 17:57
*/

public interface DishService extends IService<Dish> {
    
    public DishDto getByIdWithFlavor(Long id);

    public void saveWithFlavor(DishDto dishDto);
    
}

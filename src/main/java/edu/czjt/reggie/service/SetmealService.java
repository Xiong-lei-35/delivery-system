package edu.czjt.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import edu.czjt.reggie.dto.SetmealDto;
import edu.czjt.reggie.entity.Setmeal;


import java.util.List;

/**
 *@Author zhang_bingru20855066
 *@Date 2023/6/15 17:57
*/

public interface SetmealService extends IService<Setmeal> {
    
    /**
     * 新增套餐，同时需要保存套餐和菜品的关联关系
     * @param setmealDto
     */
    public void saveWithDish(SetmealDto setmealDto);

    /**
     * 删除套餐，同时需要删除套餐和菜品的关联数据
     * @param ids
     */
    public void removeWithDish(List<Long> ids);
}

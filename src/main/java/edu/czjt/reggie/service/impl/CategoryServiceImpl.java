package edu.czjt.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import edu.czjt.reggie.entity.Category;
import edu.czjt.reggie.mapper.CategoryMapper;
import edu.czjt.reggie.service.CategoryService;
import org.springframework.stereotype.Service;

/**
 *@Author zhang_bingru20855066
 *@Date 2023/6/15 17:57
*/

@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {
  
}

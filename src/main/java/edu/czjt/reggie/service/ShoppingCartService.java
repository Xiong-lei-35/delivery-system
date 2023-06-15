package edu.czjt.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import edu.czjt.reggie.entity.ShoppingCart;

/**
 *@Author zhang_bingru20855066
 *@Date 2023/6/15 17:57
*/

//这是一个Java接口，名为ShoppingCartService，它继承自IService<ShoppingCart>接口。
//IService是一个通用的服务接口，它定义了一些通用的方法，如增删改查等。
//ShoppingCart是一个实体类，表示购物车。
//ShoppingCartService接口定义了一些操作购物车的方法
//这个接口的具体实现可以通过Spring框架的依赖注入来完成。
public interface ShoppingCartService extends IService<ShoppingCart> {

}

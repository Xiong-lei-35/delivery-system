package edu.czjt.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import edu.czjt.reggie.entity.Orders;

/**
 *@Author zhang_bingru20855066
 *@Date 2023/6/15 17:57
*/

public interface OrderService extends IService<Orders> {

    /**
     * 用户下单
     * @param orders
     */

    //submit方法可能是将订单提交到某个系统或者服务中进行处理
    public void submit(Orders orders);
    
    //，而submitAgain方法可能是重新提交之前失败的订单
    public void submitAgain(Orders orders);
    
}

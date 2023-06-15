package edu.czjt.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import edu.czjt.reggie.entity.OrderDetail;
import edu.czjt.reggie.mapper.OrderDetailMapper;
import edu.czjt.reggie.service.OrderDetailService;
import org.springframework.stereotype.Service;

/**
 *@Author zhang_bingru20855066
 *@Date 2023/6/15 17:57
*/

@Service
public class OrderDetailServiceImpl extends ServiceImpl<OrderDetailMapper, OrderDetail> implements OrderDetailService {

}

package com.zb.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 订单管理
 *
 * @className: OrderController
 * @package: com.zb.order.controller
 * @author: zhangbing
 * @date: 2020/4/12 4:23 下午
 */

@RequestMapping("/order")
@RestController
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    @PostMapping("/submit")
    public String submitOrder() {
        return restTemplate.getForObject("http://spring-cloud-user/user/hello/?name="+"order", String.class);
    }
}

package com.zb.nacos.register.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 注册中心管理
 *
 * @className: RegisterController
 * @package: com.zb.nacos.register.controller
 * @author: zhangbing
 * @date: 2020/4/12 4:40 下午
 */
@RequestMapping("/register")
@RestController
public class RegisterController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/getServerList")
    public List<ServiceInstance> submitOrder(@RequestParam("serverName") String serverName) {
        return discoveryClient.getInstances(serverName);
    }
}

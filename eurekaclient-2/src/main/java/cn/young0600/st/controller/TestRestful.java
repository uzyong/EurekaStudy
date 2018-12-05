package cn.young0600.st.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestful {
    @Autowired
    private DiscoveryClient client;

    private final Logger logger = Logger.getLogger(getClass());

    @RequestMapping(value = "/home")
    public String hello() {
        ServiceInstance instance = client.getLocalServiceInstance();
        logger.info("serviceId:" + instance.getServiceId() + ",host:post=" + instance.getHost() + ":" + instance.getPort());
        return "hello spring";
    }


}

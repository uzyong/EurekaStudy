package cn.young0600.st.eurekaappribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/find")
    public String find() {
        //url中对应api提供者的名称，全大写
        String s = restTemplate.getForEntity("http://API-USER-SERVER/user/find/123", String.class).getBody();
        return s;
    }

    /**
     * 测试下外网，也就是如果域名是外网的，不在eureka注册服务中的，会怎样     * @return
     */
    @GetMapping(value = "/test")
    @ResponseBody
    public String test() {
        //url中对应api提供者的名称，全大写
        return restTemplate.getForEntity("http://www.baidu.com/", String.class).getBody();
    }

}

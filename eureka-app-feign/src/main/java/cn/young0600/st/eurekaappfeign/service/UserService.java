package cn.young0600.st.eurekaappfeign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("API-USER-SERVER")
@Component
public interface UserService {


    @GetMapping(value = "/user/find/{id}")
    String find(@PathVariable("id") String id);


}

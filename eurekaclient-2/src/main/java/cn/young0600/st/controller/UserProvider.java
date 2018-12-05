package cn.young0600.st.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/user")
public class UserProvider {

    @GetMapping(value = "/find/{id}")
    public String find(@PathVariable("id") String id, HttpServletRequest request) {
        return "Hi,the port is: " + request.getLocalPort();
    }


}

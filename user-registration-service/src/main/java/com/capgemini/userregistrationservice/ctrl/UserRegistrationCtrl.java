package com.capgemini.userregistrationservice.ctrl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/userCtrl")
public class UserRegistrationCtrl {

    @GetMapping("/getUser/{id}")
    public String getUser(@PathVariable String id){
        System.out.println("getUser---"+id);
        String name="meena-Cap-HCL";
       // String name2="Bavi";
        System.out.println("getUser---"+name);
        return name;

    }
}

package com.capgemini.userregistrationservice.ctrl;

import org.apache.catalina.User;
import org.springframework.web.bind.annotation.*;

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
    @PostMapping("/createUser")
    public String createUser(@RequestBody User user){
        System.out.println("createUser---"+user);
        return "success";
    }
}

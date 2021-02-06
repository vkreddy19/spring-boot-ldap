package com.mycompany;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LDAPController {

    private static final String template = "Hello, %s!";

    @PostMapping("/login.html")
    public String auth(@RequestBody String newEmployee) {
        System.out.println(newEmployee);
        return newEmployee;
    }
}

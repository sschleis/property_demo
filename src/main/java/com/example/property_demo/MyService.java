package com.example.property_demo;

import com.example.property_demo.externals.ServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyService {

    @Value("${classic.value}")
    private String classic;

    @Autowired
    private MyConfig myConfig;

    @Autowired
    private ServiceClient serviceClient;

    @GetMapping("/")
    public String get() {
        return classic + "  " + myConfig.getValue() + " " + serviceClient.get();
    }
}

package com.example.property_demo.externals;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
//@RefreshScope
public class ServiceClient {

    @Value("${service.client}")
    private String str;

    public String get(){
        return str;
    }

}

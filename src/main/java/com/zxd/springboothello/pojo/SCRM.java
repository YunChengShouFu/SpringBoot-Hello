package com.zxd.springboothello.pojo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "scrm")
@Data
public class SCRM {
    private String username;
    private String password;
}

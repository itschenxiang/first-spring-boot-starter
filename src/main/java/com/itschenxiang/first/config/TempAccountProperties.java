package com.itschenxiang.first.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "access.account")
public class TempAccountProperties {
    private String secretId;
    private String secretToken;
}
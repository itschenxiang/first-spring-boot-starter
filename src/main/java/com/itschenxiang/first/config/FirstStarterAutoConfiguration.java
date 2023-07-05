package com.itschenxiang.first.config;

import com.itschenxiang.first.dto.TempAccessAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(value = {TempAccountProperties.class})
public class FirstStarterAutoConfiguration {
    @Autowired
    private TempAccountProperties tempAccountProperties;
    
    @Bean
    @ConditionalOnMissingBean(TempAccessAccount.class)
    public TempAccessAccount tempAccessAccount() {
        return new TempAccessAccount(tempAccountProperties.getSecretId(),
                tempAccountProperties.getSecretToken());
    }
    
}

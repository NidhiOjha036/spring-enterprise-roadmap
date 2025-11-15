package com.nidhi.config;

import com.nidhi.Desktop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    //@Bean(name = {"desk1","desk2"})
    @Bean
    @Scope("prototype")
    public Desktop desktop()
    {
        return new Desktop();
    }

}

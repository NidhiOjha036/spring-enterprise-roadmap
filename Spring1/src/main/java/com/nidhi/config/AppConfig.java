package com.nidhi.config;

import com.nidhi.Desktop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Desktop desktop()
    {
        return new Desktop();
    }

}

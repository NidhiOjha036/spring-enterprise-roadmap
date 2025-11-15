package com.nidhi.config;

import com.nidhi.Alien;
import com.nidhi.Computer;
import com.nidhi.Desktop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean
    public Alien alien(Computer com)
    {
        Alien obj = new Alien();
        obj.setAge(25);
        obj.setCom(com);
        return obj;
    }

    //@Bean(name = {"desk1","desk2"})
    @Bean
    //@Scope("prototype")
    public Desktop desktop()
    {
        return new Desktop();
    }

}

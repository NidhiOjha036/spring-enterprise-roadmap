package com.nidhi.config;

import com.nidhi.Alien;
import com.nidhi.Computer;
import com.nidhi.Desktop;
import com.nidhi.Laptop;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.nidhi")
public class AppConfig {

//    @Bean
//    public Alien alien(Computer com)
//    {
//        Alien obj = new Alien();
//        obj.setAge(25);
//        obj.setCom(com);
//        return obj;
//    }
//
//    //@Bean(name = {"desk1","desk2"})
//    @Bean
//    //@Scope("prototype")
//    public Desktop desktop()
//    {
//        return new Desktop();
//    }
//
//    @Bean
//    @Primary
//    public Laptop laptop(){
//        return  new Laptop();
//    }

}

package com.hs.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;

/**
 * description:${todo} <br/>
 * Date:     2017/7/4 17:27<br/>
 *
 * @author work_tl
 * @see
 * @since JDK 1.8
 */
@SpringBootApplication
@EnableAutoConfiguration
@MapperScan(basePackages = "com.hs.server.dao.impl")
public class App {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(new Object[]{App.class});
        Map<String, Object> defProperties = new HashMap();
        defProperties.put("spring.profiles.default", "dev");
        app.setDefaultProperties(defProperties);
        app.run(args);
    }
}

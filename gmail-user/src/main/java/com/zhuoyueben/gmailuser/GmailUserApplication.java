package com.zhuoyueben.gmailuser;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zhuoyueben.gmailuser.dao")
public class GmailUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(GmailUserApplication.class, args);
    }

}

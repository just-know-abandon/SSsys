package com.lhj.studenthome;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@ServletComponentScan(basePackages = "com.lhj.service")
@MapperScan("com.lhj.sql.Mapper")
@ComponentScan(basePackages = "com.lhj.sql.*")
@EnableTransactionManagement
public class StudenthomeApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudenthomeApplication.class, args);
    }

}

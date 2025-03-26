package com.example.testminiproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@SpringBootApplication
public class TestMiniProjectApplication implements CommandLineRunner {

    @Autowired
    private DataSource dataSource;

    public static void main(String[] args) {
        SpringApplication.run(TestMiniProjectApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        if (dataSource != null) {
            System.out.println("DataSource 연결 성공!");
        } else {
            System.err.println("DataSource 연결 실패!");
        }
    }
}

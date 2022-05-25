package com.example.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import Entity.Spring;
import Service.springService;

@SpringBootApplication
public class SpringDi2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringDi2Application.class, args);

        springService userService = new springService();
        List<Spring> list = userService.findAll();
        //for文でSQL文内の処理をするので、その上に表示したい文字列を入れる
        System.out.println("【Product】");
        for (Spring u : list) {
            System.out.println(u.getUserInfo());
        }

    }
}
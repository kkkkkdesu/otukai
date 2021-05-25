package com.example.service;

import com.example.OtukaiApplication;
import com.example.persistance.entity.Shopping;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.context.ApplicationContext;

import java.time.LocalDate;
import java.util.List;

public class ShoppingServiceTest {

    public static void main(String[] args) {
        // DIコンテナの作成
        SpringApplication application = new SpringApplication(OtukaiApplication.class);
        application.setWebApplicationType(WebApplicationType.NONE); // Webアプリケーション環境を無効化
        ApplicationContext context = application.run(args);

        // EmployeeServiceのBeanを取得
        ShoppingService shoppingService = context.getBean(ShoppingService.class);

        // 新規追加のテスト
        System.out.println("==== 新規追加 ====");
        shoppingService.insert(new Shopping("ぶどう", 10, "八百屋"));

        // 全件検索のテスト
        System.out.println("==== 全件検索 ====");
        List<Shopping> shoppingList1 = shoppingService.findAll();
        for (Shopping shopping : shoppingList1) {
            System.out.println(shopping);
        }
    }

}

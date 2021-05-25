package com.example.persistance.mapper;

import com.example.OtukaiApplication;
import com.example.persistance.entity.Shopping;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.context.ApplicationContext;

//import java.time.LocalDate;
import java.util.List;

public class ShoppingMapperTest {

    public static void main(String[] args) {
        // DIコンテナの作成
        SpringApplication application = new SpringApplication(OtukaiApplication.class);
        application.setWebApplicationType(WebApplicationType.NONE); // Webアプリケーション環境を無効化
        ApplicationContext context = application.run(args);

        // EmployeeMapperのBeanを取得
        ShoppingMapper shoppingMapper = context.getBean(ShoppingMapper.class);

        // 新規追加のテスト
        System.out.println("==== 新規追加 ====");
        shoppingMapper.insert(new Shopping("オレンジ", 5, "ドンキホーテ"));

        // 全件検索のテスト
        System.out.println("==== 全件検索 ====");
        List<Shopping> List1 = shoppingMapper.findAll();
        for (Shopping shopping : List1) {
            System.out.println(shopping);
        }
    }
}

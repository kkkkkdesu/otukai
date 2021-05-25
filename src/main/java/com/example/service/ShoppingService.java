package com.example.service;

import com.example.persistance.entity.Shopping;

import java.util.List;

public interface ShoppingService {

    //全検索
    List<Shopping> findAll();

    //削除

    //追加
    void insert(Shopping shopping);

}

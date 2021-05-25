package com.example.service.impl;

import com.example.persistance.entity.Shopping;
import com.example.persistance.mapper.ShoppingMapper;
import com.example.service.ShoppingService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ShoppingServiceImpl implements ShoppingService {

    private final ShoppingMapper shoppingMapper;

    //@Autowired
    public ShoppingServiceImpl(ShoppingMapper shoppingMapper) {
        this.shoppingMapper = shoppingMapper;
    }

    @Transactional(readOnly = true)
    @Override
    public List<Shopping> findAll() {
        List<Shopping> shoppingList = shoppingMapper.findAll();
        return shoppingList;
    }

    @Transactional(readOnly = false)
    @Override
    public void insert(Shopping shopping) {
        shoppingMapper.insert(shopping);
    }
}

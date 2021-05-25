package com.example.persistance.mapper;

import com.example.persistance.entity.Shopping;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ShoppingMapper {

    //全文検索
    @Select("SELECT s.id AS id, s.name AS name, s.num AS num, s.place AS place" +
            " FROM shopping s")
    List<Shopping> findAll();

    //削除

    //追加
    @Insert("INSERT INTO shopping(name, num, place)" +
            " VALUES(#{name}, #{num}, #{place})")
    @Options(useGeneratedKeys = true, keyColumn = "id", keyProperty = "id")
    void insert(Shopping shopping);
}

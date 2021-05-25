package com.example.web.form;

import com.example.persistance.entity.Shopping;
//import org.springframework.format.annotation.DateTimeFormat;

//import java.time.LocalDate;

public class ShoppingForm {

    private String name;
    // TODO アノテーションを付加する
    private Integer num;
    private String place;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Integer getNum() {
        return num;
    }
    public void setNum(Integer num) {
        this.num = num;
    }

    public String getPlace() {
        return place;
    }
    public void setPlace(String place){
        this.place = place;
    }

    public Shopping convertToEntity() {
        return new Shopping(name, num, place);
    }

}

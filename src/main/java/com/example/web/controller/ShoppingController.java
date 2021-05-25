package com.example.web.controller;


import com.example.persistance.entity.Shopping;
import com.example.service.ShoppingService;
import com.example.web.form.ShoppingForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/shopping")
public class ShoppingController {

    private final ShoppingService shoppingService;

    // shoppingServiceをDIする
    // @Autowired
    public ShoppingController(ShoppingService shoppingService) {
        this.shoppingService = shoppingService;
    }

    /**
     * 全件検索を行い、一覧画面に遷移する。
     */
    @GetMapping("/index")
    public String index(Model model) {
        List<Shopping> shoppingList = shoppingService.findAll();
        model.addAttribute("shoppingList", shoppingList);
        return "shopping/index";
    }

    /**
     * 入力画面に遷移する。
     */
    @GetMapping("/insertMain")
    public String insertMain() {
        return "shopping/insertMain";
    }

    /**
     * 入力を受け取り、DBへの追加を実行する。
     * 追加処理完了後は、一覧画面にリダイレクトする。
     */
    @PostMapping("/insertComplete")
    public String insertComplete(ShoppingForm shoppingForm) {
        // フォームをエンティティに変換する
        Shopping shopping = shoppingForm.convertToEntity();
        // DBに追加
        shoppingService.insert(shopping);
        // 一覧画面にリダイレクトする
        return "redirect:index";
    }
}

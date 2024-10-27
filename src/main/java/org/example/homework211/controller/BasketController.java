package org.example.homework211.controller;

import lombok.RequiredArgsConstructor;
import org.example.homework211.service.BasketService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/store/order")
public class BasketController {

    private final BasketService basketService;

    @GetMapping("/add")
    public List<Integer> add(@RequestParam List<Integer> ids) {
        basketService.addAll(ids);
        return basketService.get();
    }

    @GetMapping("/get")
    public List<Integer> get(){
        return basketService.get();
    }

}

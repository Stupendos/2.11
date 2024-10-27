package org.example.homework211.service;

import lombok.RequiredArgsConstructor;
import org.example.homework211.basket.Basket;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BasketService {

    private final Basket basket;

    public void addAll(List<Integer> ids){
        ids.forEach(basket::add);
    }

    public List<Integer> get(){
        return basket.getAll();
    }
}

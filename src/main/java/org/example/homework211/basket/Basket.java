package org.example.homework211.basket;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Data
@Service
@SessionScope
@RequiredArgsConstructor
public class Basket {
    private final List<Integer> goods = new ArrayList<>();

    public Integer add(Integer id) {
        goods.add(id);
        return id;
    }

    public List<Integer> getAll() {
        return new ArrayList<>(goods);
    }

}

package com.skypro.shop.service;

import com.skypro.shop.repository.RepositoryShop;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
@Service
public class ServiceShop {
    private final RepositoryShop repositoryShop;

    public ServiceShop(RepositoryShop repositoryShop) {
        this.repositoryShop = repositoryShop;
    }

    public void addToCart(List<Integer> ids) {
this.repositoryShop.addToCart(ids);
    }

    public List<Integer> getCartContent() {
        return Collections.emptyList();
    }
}

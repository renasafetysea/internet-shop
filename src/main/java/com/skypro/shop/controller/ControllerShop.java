package com.skypro.shop.controller;

import com.skypro.shop.service.ServiceShop;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/store/order")
public class ControllerShop {
  private final ServiceShop serviceShop;

  public ControllerShop(ServiceShop serviceShop) {
    this.serviceShop = serviceShop;
  }

  @GetMapping("/add")
    public String add(@RequestParam("id") List<Integer> ids) {
    this.serviceShop.addToCart(ids);
    return "Приняты идентификаторы" + ids;

    }
    @GetMapping("/get")
    public List<Integer> get() {
        return this.serviceShop.getCartContent();
    }
}

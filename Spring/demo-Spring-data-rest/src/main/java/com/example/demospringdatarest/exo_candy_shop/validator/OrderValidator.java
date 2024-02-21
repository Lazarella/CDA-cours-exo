package com.example.demospringdatarest.exo_candy_shop.validator;

import com.example.demospringdatarest.exo_candy_shop.entity.Order;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component("afterCreateOrderValidator")
public class OrderValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return Order.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
Order order = (Order) target;
        System.out.println("la commande a bien été crée!");
    }
}

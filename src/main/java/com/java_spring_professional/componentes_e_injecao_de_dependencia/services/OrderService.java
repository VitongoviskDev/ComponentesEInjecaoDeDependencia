package com.java_spring_professional.componentes_e_injecao_de_dependencia.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java_spring_professional.componentes_e_injecao_de_dependencia.entities.Order;

@Service
public class OrderService {

    @Autowired
    ShippingService shippingService;

    public double total(Order order){
        double total = order.getBasic() * (1 - order.getDiscount() * .01);
        total += shippingService.shipment(order);
        return total;
    }
}

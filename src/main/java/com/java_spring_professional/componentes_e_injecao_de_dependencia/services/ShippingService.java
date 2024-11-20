package com.java_spring_professional.componentes_e_injecao_de_dependencia.services;

import org.springframework.stereotype.Service;

import com.java_spring_professional.componentes_e_injecao_de_dependencia.entities.Order;

@Service
public class ShippingService {
    public double shipment(Order order){
        if(order.getBasic() < 100)
            return 20;
        else if(order.getBasic() <= 200)
            return 12;
        else return 0;
    }
}

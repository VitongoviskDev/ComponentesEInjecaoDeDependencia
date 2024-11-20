package com.java_spring_professional.componentes_e_injecao_de_dependencia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.java_spring_professional.componentes_e_injecao_de_dependencia.entities.Order;
import com.java_spring_professional.componentes_e_injecao_de_dependencia.services.OrderService;

@SpringBootApplication
public class ComponentesEInjecaoDeDependenciaApplication implements CommandLineRunner{

	@Autowired
	OrderService orderService;
	public static void main(String[] args) {
		SpringApplication.run(ComponentesEInjecaoDeDependenciaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Order order = new Order(1231, 100, 10);
		double total = orderService.total(order);
		System.out.println(total);
	}
}

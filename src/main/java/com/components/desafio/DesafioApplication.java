package com.components.desafio;
import java.util.Locale;
import com.components.desafio.entities.Order;
import com.components.desafio.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DesafioApplication implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(DesafioApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Locale.setDefault(Locale.US);
		Order order = new Order(1034, 150.00, 20.0);
		System.out.printf("Pedido código %d%nValor total: R$ %.2f%n", order.getCode(), orderService.total(order));
	}
}

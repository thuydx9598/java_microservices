package tk.thuy.OrdersService;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@EnableDiscoveryClient
@SpringBootApplication
@RestController
public class OrdersServiceApplication {

	@Value("${service.instance.name}")
	private String instance;

	public static void main(String[] args) {
		SpringApplication.run(OrdersServiceApplication.class, args);
	}

	@RequestMapping("/")
	public String getAll() {
		return "Hello from " + instance;
	}

	@RequestMapping("/{id}")
	public String getById(@PathVariable int id) {
		return "Hello from " + instance + " with ID: " + id;
	}
}

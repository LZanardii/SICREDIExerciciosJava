package com.example.PrimeiroProjeto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PrimeiroProjetoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrimeiroProjetoApplication.class, args);
	}

	//printando 1 parametro no format
	@GetMapping("/hello")
	public static String hello(@RequestParam(value = "name", defaultValue = "world")String name) {
		return String.format("Hello %s!", name);
	}
	//ex: http://localhost:8080/hello?name=leo

	//pritando mais de 1 parametro no format
	@GetMapping("/hello2")
	public static String hello2(@RequestParam(value = "name", defaultValue = "world")String name) {
		return String.format("Hello %s! Numero fixo %d", name, 10);
	}
	//ex: http://localhost:8080/hello2?name=leo

	//printando com dois parametros no request
	@GetMapping("/hello3")
	public static String hello3(@RequestParam(value = "name", defaultValue = "world")String name,
								@RequestParam(value = "numero", defaultValue = "10")String nro) {
		return String.format("Hello %s! Numero fixo %s", name, nro);
	}
	//ex: http://localhost:8080/hello3?name=leo&numero=15


	//printando sem parametro na url
	@GetMapping("/")
	public static String hello() {
		return String.format("ola %s!");
	}
	//ex: http://localhost:8080/
}

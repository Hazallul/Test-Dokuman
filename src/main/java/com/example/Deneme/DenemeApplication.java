package com.example.Deneme;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
@RequestMapping("/Deneme")
public class DenemeApplication {

	private String Kaydet;
	private String test2="Geri Mesaj: ";
	public static void main(String[] args) {
		SpringApplication.run(DenemeApplication.class, args);}


@PostMapping("Test")
	public String Denemeeee (@RequestBody String test) {
		this.Kaydet=test2+test;
		return Kaydet;
}


@GetMapping("/Merhaba")
	public String Deneme(){

		return "Selamm Olmuyo";
	}



}

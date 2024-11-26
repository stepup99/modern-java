package com.example.demo_modern_java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Map;

@SpringBootApplication
public class DemoModernJavaApplication {

	public static void main(String[] args) {
		System.out.println("this is nice");
		SpringApplication.run(DemoModernJavaApplication.class, args);
		var list = List.of("adam", "mack");
		System.out.println(list);
		var map = Map.ofEntries(Map.entry("a", List.of("adam", "alex")));
		System.out.println(map);

		for (var name:list){
			System.out.println("name = : " +name);
		}


		map.forEach((var s, var strings)->{
			System.out.println("s : "+s);
			System.out.println("strings : "+strings);
		});

	}

}

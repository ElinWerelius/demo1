package com.example.demo1;

import com.example.demo1.repositories.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.converter.json.GsonBuilderUtils;


@SpringBootApplication

public class Demo1Application {

	@Autowired
	SongRepository songRepository;

public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
	}

}

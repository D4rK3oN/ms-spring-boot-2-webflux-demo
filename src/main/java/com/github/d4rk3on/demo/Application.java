package com.github.d4rk3on.demo;

import lombok.Generated;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@Generated
@SpringBootApplication(scanBasePackages = "com.github.d4rk3on")
public class Application {

  public static void main(String[] args) {

    SpringApplication.run(Application.class, args);
  }
}

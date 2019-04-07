package pl.sda.intermediate16;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        System.out.println(args[0]);
        SpringApplication.run(App.class);
    }
}

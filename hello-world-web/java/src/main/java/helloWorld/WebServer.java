package helloWorld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class WebServer {

    public static void main(String[] args) {
        SpringApplication.run(WebServer.class, args);
    }

    @RequestMapping("/")
    public String index() {
        return "Hello World!";
    }
}


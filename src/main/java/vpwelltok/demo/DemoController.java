package vpwelltok.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // this has to be added to create a REST endpoint
public class DemoController {

    @GetMapping(value = "/hello")
    public String sayHello() {
        return "hello, welcome to Luke's demo application";
    }
}

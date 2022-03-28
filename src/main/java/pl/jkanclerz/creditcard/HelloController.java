package pl.jkanclerz.creditcard;

import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {



    public  HelloController(NameProvider nameProvider) {
        this.nameProvider = nameProvider;
    }

    @GetMapping("/hello")
    List<String> names() {
        return nameProvider.allNames();
    }
    String hello() {
        return "Hi 5 Kamil";
    }
}

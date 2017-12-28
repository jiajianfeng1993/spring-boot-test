package springbootexample.springboothello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springbootexample.springboothello.properties.BeanProperties;

@SpringBootApplication
@RestController
public class SpringBootHelloApplication {

    @Autowired
    BeanProperties properties;

    @RequestMapping("/")
    public String test(){
        return "testOKKKK?"+properties.toString();
    }


    public static void main(String[] args) throws Exception {
        System.out.println("start main...");
        SpringApplication.run(SpringBootHelloApplication.class, args);
    }
}

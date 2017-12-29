package springbootexample.springboothello;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import springbootexample.springboothello.properties.BeanProperties;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootHelloApplicationTests {

	@Autowired
	BeanProperties properties;
	@Test
	public void contextLoads() {
		System.out.println(properties);
	}

}

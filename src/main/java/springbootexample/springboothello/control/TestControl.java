package springbootexample.springboothello.control;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Controller;
import springbootexample.springboothello.condition.TestCondition;

@Controller
@Conditional(value = TestCondition.class)
public class TestControl {
    public TestControl(){
        TestCondition con=new TestCondition();
        con.matches(null,null);
        System.out.println("Test Control init...");
    }
}

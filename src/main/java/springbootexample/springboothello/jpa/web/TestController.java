package springbootexample.springboothello.jpa.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springbootexample.springboothello.jpa.bean.Test;
import springbootexample.springboothello.jpa.repository.TestRepository;
import springbootexample.springboothello.jpa.service.TestService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("jpa")
public class TestController {

    @Autowired
    TestService service;

    @Autowired
    TestRepository repository;
    @RequestMapping("get")
    public Test get(){
        Test test = repository.findOne(6);
        return  test;
    }
    @RequestMapping("testAdds")
    public String testAdds(){
        List<Test> list=new ArrayList<Test>();
        Test test=new Test();
        test.setKemu("英语");
        test.setName("哈哈哈");
        test.setScore(20);
        Test test2=new Test();
        test2.setId(100);
        test2.setName("否电话及付款"+System.currentTimeMillis());
        test2.setKemu("放假放假");
        list.add(test);
        list.add(test2);
        try {
            service.addTestBeans(list);
        }catch (Exception e){
            System.out.println("Exection occur");
        }
        return "success";
    }
}

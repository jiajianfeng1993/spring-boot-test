package springbootexample.springboothello.jpa.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springbootexample.springboothello.jpa.bean.Test;
import springbootexample.springboothello.jpa.repository.TestRepository;

@RestController
@RequestMapping("jpa")
public class TestController {

    @Autowired
    TestRepository repository;

    @RequestMapping("get")
    public Test get(){
        Test test = repository.findOne(6);
        return  test;
    }
}

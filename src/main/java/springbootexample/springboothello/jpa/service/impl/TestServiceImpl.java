package springbootexample.springboothello.jpa.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import springbootexample.springboothello.jpa.bean.Test;
import springbootexample.springboothello.jpa.repository.TestRepository;
import springbootexample.springboothello.jpa.service.TestService;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    TestRepository repository;
    @Override
    @Transactional
    public boolean addTestBeans(List<Test> tests) {
        if(null==tests|| tests.size()==0){
            return true;
        }
        for (Test test:tests) {
            Test test1 = repository.saveAndFlush(test);
        }
        if(1>0)
            throw new RuntimeException();
        return true;
    }
}

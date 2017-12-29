package springbootexample.springboothello.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springbootexample.springboothello.jpa.bean.Test;

public interface TestRepository extends JpaRepository<Test,Integer> {

}

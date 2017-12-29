package springbootexample.springboothello.html;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/html")
public class HtmlPageControl {
    @RequestMapping("list")
    public String list(ModelMap model){
        model.put("name","jaijianfeng,hyper");
        return "test";
    }
}

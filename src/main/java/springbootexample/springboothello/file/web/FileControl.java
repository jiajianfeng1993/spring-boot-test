package springbootexample.springboothello.file.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import springbootexample.springboothello.file.bean.UploadBean;

@Controller
@RequestMapping("file")
public class FileControl {
    @RequestMapping("toPage")
    public String toPage(){
        return "fileUpLoadPage";
    }
    @RequestMapping("upload")
    @ResponseBody
    public String upload(UploadBean bean){
        MultipartFile headPic = bean.getHeadPic();

        String filename = headPic.getOriginalFilename();
        System.out.println(filename);
        return "Success";

    }
}

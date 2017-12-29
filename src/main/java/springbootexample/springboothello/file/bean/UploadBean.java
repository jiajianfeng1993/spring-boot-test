package springbootexample.springboothello.file.bean;

import org.springframework.web.multipart.MultipartFile;

public class UploadBean {
    String id;
    String name;
    MultipartFile headPic;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MultipartFile getHeadPic() {
        return headPic;
    }

    public void setHeadPic(MultipartFile headPic) {
        this.headPic = headPic;
    }
}

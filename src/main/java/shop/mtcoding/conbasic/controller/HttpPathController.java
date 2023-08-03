package shop.mtcoding.conbasic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HttpPathController {

    // 어노테이션을 사용하여 URL 경로 변수를 전달하는 방법
    @GetMapping("/data/path/v1/{id}")
    public String pathV1(@PathVariable("id") int id){
        return "받은 값 : "+id;
    }
}

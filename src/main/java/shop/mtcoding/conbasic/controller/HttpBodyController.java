package shop.mtcoding.conbasic.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import shop.mtcoding.conbasic.dto.BoardReqDto;

@RestController
public class HttpBodyController {

    // 스프링부트에서 body값의 MIME 타입 기본값 : x-www-form-urlencoded
    @PostMapping("/data/body/v1")
    public String bodyV1(@RequestParam("title") String title){
        return "받은 값 : "+title;
    }

    @PostMapping("/data/body/v2")
    public String bodyV2(@RequestParam("title") String title, @RequestParam("content") String content){
        return "받은 값 : "+title+", "+content;
    }

    
    // http://localhost:8080/
    // 메서드 : post
    // x-www-form-urlencoded -> title=값&content=값
    // @RequestBody : JSON 데이터를 받을 수 있다
    // application/json -> {"title" : "값", "content" : "값"}
    @PostMapping("/data/body/v3")
    public String bodyV3(@RequestBody BoardReqDto boardReqDto){
        return "받은 값 : "+boardReqDto.getTitle()+", "+boardReqDto.getContent();
    }
}

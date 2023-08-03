package shop.mtcoding.conbasic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HttpQueryController {

    // http://localhost:8080/data/query/v1 이렇게 요청하면 에러뜸 : queryString이 전달되지 않았기 때문
    // http://localhost:8080/data/query/v1?keyword=ssar 으로 요청
    @GetMapping("/data/query/v1")
    public String queryV1(@RequestParam("keyword") String keyword){
        return "받은 값 : "+keyword;
    }

    // required = false 속성을 통해 null을 허용할 수 있음
    @GetMapping("/data/query/v2")
    public String queryV2(@RequestParam(value = "keyword", required = false) String keyword){
        return "받은 값 : "+keyword;
    }

    // defaultValue = "cos" 속성을 통해 기본값을 할당
    // defaultValue에는 String 타입의 문자열만 할당할 수 있습니다.
    @GetMapping("/data/query/v3")
    public String queryV3(@RequestParam(value = "keyword", required = false, defaultValue = "cos") String keyword){
        return "받은 값 : "+keyword;
    }

    // 제일 많이 쓰는 방법
    // @RequestParam 어노테이션은 생략 가능
    @GetMapping("/data/query/v4")
    public String queryV4(String keyword){
        return "받은 값 : "+keyword;
    }

    // QueryString은 &로 여러개의 데이터를 구분해서 전달할 수 있음
    // 쿼리스트링 : ?keyword=값&type=값
    @GetMapping("/data/query/v5")
    public String queryV5(String keyword, String type){
        return "받은 값 : "+keyword+", "+type;
    }
}

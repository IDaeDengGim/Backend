package IDaeDengGim.indiepicks_demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.ZonedDateTime;

@Controller
public class BasicController {
    @GetMapping("/") //메인페이지로 접속하면 안녕하세요를 보내주는 코드
    @ResponseBody //:return 데이터를 그대로 보내주라는 뜻이라 html을 전송하고 싶을 때는 빼줘야 함
    String hello(){
        return "왜 db연결이 안 되는걸까 ..."; //resources > static 폴더가 기본 경로
    }
}

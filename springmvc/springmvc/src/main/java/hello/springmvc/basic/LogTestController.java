package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Slf4j
@RestController
public class LogTestController {
    // private final Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping("/log-test")
    public String logTest() {
        String name = "Spring";

        System.out.println("name = " + name);

        log.trace("trace log={}", name);    // 로깅 레벨 중 가장 낮은 수준
        log.debug("debug log={}", name); // 디버그 할 때 보는 로그 개발 서버 등
        log.info("info log={}", name);  // 중요한 정보, 비즈니스
        log.warn("warn log={}", name); // 경고
        log.error("error log={}", name);    // 에러

        return "ok";
    }
}

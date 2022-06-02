package ks.study.springbootkafka;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootKafkaApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void 문자열테스트(){
        String dlvNo = null;

        if(!dlvNo.trim().isEmpty() && dlvNo != null ) {
            System.out.println("dlvNo = " + dlvNo);
        } else {
            System.out.println("오류");
        }
    }
}

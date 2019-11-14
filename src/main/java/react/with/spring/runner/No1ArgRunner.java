package react.with.spring.runner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * No1ArgRunner
 */
@Order(1)//runner  클래스 실행 순서
@Component
public class No1ArgRunner implements ApplicationRunner {

    Logger logger = LoggerFactory.getLogger(No1ArgRunner.class);

    @Autowired
    private String hello;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        logger.info("===|No1ArgRunner:1|===");
        //vn argument
        logger.info("foo => "+args.containsOption("foo"));
        //program argument
        logger.info("bar => "+args.containsOption("bar"));
        //해당 환경이 운영 환경이냐 테스트 환경이냐에 따라서 설정 파일이 달라 질수 있다.
        logger.info("현재 환경 => "+ hello);
    
    }
}
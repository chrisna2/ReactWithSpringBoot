package react.with.spring.runner;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import react.with.spring.properties.ApplicationProperty;

/**
 * No3PropertyRunner
 */
@Order(3)
@Component
public class No3PropertyRunner implements ApplicationRunner {

    Logger logger = LoggerFactory.getLogger(No3PropertyRunner.class);

    @Autowired
    ApplicationProperty properties;
    //변수가 많은 경우 : 위와 같이 DTO 형태로 가져올 수 있다.

    @Override
    public void run(ApplicationArguments args) throws Exception {

        logger.info("===|No3PropertyRunner : 3|===");
        logger.info("프로그램 명 : "+properties.getAppName());
		logger.info("프로그램 타입 : "+properties.getAppType());
		logger.info("프로그램 버전 : "+properties.getAppVesion());

    }

    
}
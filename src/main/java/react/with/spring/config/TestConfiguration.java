package react.with.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * TestConfiguration
 * --> 테스트 환경 서버에서 설정되는 클래스파일
 * 
 */
@Profile("test")
@Configuration
public class TestConfiguration {

    @Bean
    public String testHello(){
        return "hello.. This is Test sever Configuration";
    }
    
}
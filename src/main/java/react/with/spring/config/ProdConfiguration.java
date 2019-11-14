package react.with.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * ProdConfiguration
 * -> 운영환경에서 실행되는 경우
 */
@Profile("prod")
@Configuration
public class ProdConfiguration {
    @Bean
    public String HelloProdServer(){
        return "Hello, This is production server. don't be test";
    }
}
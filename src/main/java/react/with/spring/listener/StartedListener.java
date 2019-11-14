package react.with.spring.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * StartedListener
 */
@Component // 이미 컨테이너가 생성된 시점에서 실행 되기 때문에 컴퍼넌트로 등록을 반드시 해주어야 한다.
public class StartedListener implements ApplicationListener<ApplicationStartedEvent> {

    Logger logger = LoggerFactory.getLogger(StartedListener.class);

    @Override
    public void onApplicationEvent(ApplicationStartedEvent event) {
        // 어플리 케이션 시작시 제일 먼저 처리되야 되는 로직들 구성
        logger.info("★ Application 시작 : "+event.getTimestamp());

    }

    
}
package react.with.spring.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;

/**
 * starting listener 생성 : 스프링 컨테이너가 생성되기 전에 실행하는 클래스 따라서 
 * application.run 하기 전에 해당 리스너를 Application 클래스에 등록 해줘야 한다.따로 컴포넌트는 등록할 필요 없음.
 */
public class StartingListener implements ApplicationListener<ApplicationStartingEvent>{

    Logger logger  = LoggerFactory.getLogger(StartingListener.class);

    @Override
    public void onApplicationEvent(ApplicationStartingEvent event) {
        // Application 시작전에 사전에 먼저 실행되는 리스너
        logger.info("★ Application Starting 리스너 : "+event.getTimestamp());
    }

}
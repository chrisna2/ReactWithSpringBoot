package react.with.spring.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * ApplicationProperty
 */
@Component
@ConfigurationProperties("react-info")//추가 의존성 파일 추가
public class ApplicationProperty {

    // 초기 버전 값
    private String appName = "react.js with Spring boot";
    private String appType = "simple web app";
    private String appVesion = "1.0.0";

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getAppType() {
        return appType;
    }

    public void setAppType(String appType) {
        this.appType = appType;
    }

    public String getAppVesion() {
        return appVesion;
    }

    public void setAppVesion(String appVesion) {
        this.appVesion = appVesion;
    }

}
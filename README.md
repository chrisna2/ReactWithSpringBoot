# ReactWithSpringBoot
리액트와 스프링 부트 두마리 토끼를 잡아보자

[참고사이트] https://start.goodtime.co.kr/2018/09/%EC%8A%A4%ED%94%84%EB%A7%81-%EB%B6%80%ED%8A%B8-%EB%A6%AC%EC%95%A1%ED%8A%B8-%EA%B0%9C%EB%B0%9C-%EC%85%8B%EC%97%85-2018/
(스프링 부트 + 리액트 개발 셋업 2018)

# 주의 사항 (삽질로그)
1. JSP 기반으로 페이지를 설정 하다보니 발생한 문제였다. 자바 1.8 이상으로 설정하였고 홈 설정 및 메이븐 4버전, 톰캣 버전 9로 설정 했는데도 
자꾸 JSP 파일이 컴파일이 되지 않아서 말썽이 발생했었다. 

```
Syntax error, parameterized types are only available if source level is 1.5 or greater
...
'<>' operator is not allowed for source level below 1.7
...
```
컴파일 에러. 그것도 자바 버전이 낮아서 JSP를 컴파일 못한다. 아무리 생각해 봐도 문제가 없는데 이러한 문제가 발생해서 살짝 열이 받았다. 
원인은 알고 봤더니 기존에 스프링 부트를 공부하면서 사용한 pom.xml을 그대로 이용했는데 여기에 들어있던 querydsl 모듈이 문제였다. 

[참조사이트] https://github.com/spring-projects/spring-boot/issues/14398

Tomcat 9는 JSP의 기본 소스 레벨로 1.8을 사용하는데 여기에 querydsl이 추가되면 클래스 경로가 querydsl-collections 4.2.1로 끝난다고 한다.
이 두 가지 종속성의 순서는 매우 중요한데. 앞 뒤 순서에 따라 자바 컴파일 버전이 갑자기 확 낮아 질수도 있다는 것이다.

해결 방법은 querydsl의 버전을 provided가 아닌 가장 최신 버전으로 사용하거나 querydsl의 의존성을 제거하는 방식이 가능하다. 
일단은 현재 querydsl을 사용하지 않고 있으므로 주석으로 막았다. querydsl을 사용할때 뷰단이 JSP인 경우 이런식의 문제가 발생할 수있으니 주의.


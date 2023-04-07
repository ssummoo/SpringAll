package kr.co.softsoldesk.beans;

import org.springframework.stereotype.Component;

@Component
public class TestBean1 {

}

//IoC(Inversion of Control : 제어역전) 컨테이너 객체를 생성할때 자동으로 객체가 생성
//Default :  Type, Singleton
//config에 @Bean으로 등록한 것과 같다
package kr.co.softsoldesk.beans;

import org.springframework.stereotype.Component;

@Component("t3")
public class TestBean2 {

}
//하나만 생성하여 사용할 경우 Type이 효율적
//이름으로 주입할 경우 식별자 역할을 하지만 BeanConfigClass에 여러개를 주입하여 사용하는것이 바람직함. 그러므로 이름 주입은 잘 사용되진 않음
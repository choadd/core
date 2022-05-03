package hello.core.singleton;

import hello.core.AppConfig;
import hello.core.member.MemberServiceImpl;
import hello.core.order.OrderSerivceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigurationSingletonTest {

    @Test
    void configurationTest(){
        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        MemberServiceImpl memeberService = ac.getBean("memeberService", MemberServiceImpl.class);
        OrderSerivceImpl orderSerivce = ac.getBean("orderService",OrderSerivceImpl.class);
    }
}

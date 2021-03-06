package hello.core.common;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.UUID;

@Component
@Scope(value = "request")
public class MyLogger {

    private String uuid;
    private String requestURL;

    public void setRequestURL(String requestURL) {
        this.requestURL = requsetURL;
    }

    public void log(String message){
        System.out.println("["+uuid+"]"+"["+requestURL+"] : "+message);
    }

    @PostConstruct
    public void init(){
        uuid = UUID.randomUUID().toString();
        System.out.println("["+uuid+"]"+"[request scope] create" + this);
    }

    @PreDestroy
    public void close(){
        System.out.println("["+uuid+"]"+"[request scope] close" + this);
    }
}

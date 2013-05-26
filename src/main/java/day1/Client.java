package day1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * User: dr.jun
 * Date: 13. 4. 22.
 * Time: 오후 5:25
 * To change this template use File | Settings | File Templates.
 */
@Component
public class Client  {

    @Autowired
    @Qualifier("prettyLog")
    private Log log;

    Client(){
        System.out.println("Construction1 log = " + log);
        this.log = log;
    }

    Client(Log log){
        System.out.println("Construction2 log = " + log);
        this.log = log;
    }

    public void setLog(Log log) {
        this.log = log;
    }

    public void biz() {
        log.write("call biz");
    }

    @PostConstruct   // init, afterProperties 와 동일
    public void init(){
        System.out.println("PostConstruct log = " + log);
    }



}

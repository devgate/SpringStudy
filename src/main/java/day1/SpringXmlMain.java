package day1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: dr.jun
 * Date: 13. 5. 2.
 * Time: 오후 5:30
 * To change this template use File | Settings | File Templates.
 */
public class SpringXmlMain {

    public static void main(String[] args){

        ApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
        Client client = (Client) factory.getBean("client");
        client.biz();

    }

}

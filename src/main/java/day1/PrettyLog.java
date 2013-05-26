package day1;

import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: dr.jun
 * Date: 13. 4. 22.
 * Time: 오후 5:42
 * To change this template use File | Settings | File Templates.
 */
@Component("prettyLog")
public class PrettyLog implements Log {

    public void write(String str) {
        System.out.println("=========================");
        System.out.println("[Pretty Log] " + str);
        System.out.println("=========================\n\n");
    }
}

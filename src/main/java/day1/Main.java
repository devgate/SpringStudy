package day1;

/**
 * Created with IntelliJ IDEA.
 * User: dr.jun
 * Date: 13. 4. 22.
 * Time: 오후 5:25
 * To change this template use File | Settings | File Templates.
 */
public class Main {

    public static void main(String args[]) {

        Log log = new PrettyLog();
        Client client = new Client(log);
        client.biz();

    }
}

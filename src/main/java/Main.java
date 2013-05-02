/**
 * Created with IntelliJ IDEA.
 * User: dr.jun
 * Date: 13. 4. 22.
 * Time: 오후 5:25
 * To change this template use File | Settings | File Templates.
 */
public class Main {

    public static void main(String args[]) {

        Client client = new Client();
        Log log = new DefaultLog();

        System.out.println("Call Default Log.");
        client.setLog(log);
        client.biz();

        System.out.println("Call Pretty Log");
        log = new PrettyLog();
        client.setLog(log);
        client.biz();
    }
}

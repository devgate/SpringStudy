/**
 * Created with IntelliJ IDEA.
 * User: dr.jun
 * Date: 13. 4. 22.
 * Time: 오후 5:25
 * To change this template use File | Settings | File Templates.
 */
public class DefaultLog implements Log {

    public void write(String str) {
        System.out.println("[Default Log] " + str + "\n");
    }

}

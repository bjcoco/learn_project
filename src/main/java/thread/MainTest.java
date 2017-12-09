package thread;

/**
 * MainTest Created by IntelliJ IDEA.
 * User: heke
 * Contract: heke_coco@126.com
 * Date: 2017/12/2
 * Time: 下午4:49
 */
public class MainTest {
    public static void main(String[] args) {
        Thread thread = new Run();
        thread.start();

        Thread thread1 = new Run();
        thread1.run();

    }
}

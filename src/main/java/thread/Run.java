package thread;

/**
 * Run Created by IntelliJ IDEA.
 * User: heke
 * Contract: heke_coco@126.com
 * Date: 2017/12/2
 * Time: 下午4:50
 */
public class Run extends Thread {
    public void run() {
        Thread a = Thread.currentThread();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(a.getId() + ":" + a.getName());
    }
}

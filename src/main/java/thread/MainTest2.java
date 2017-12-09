package thread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * MainTest2 Created by IntelliJ IDEA.
 * User: heke
 * Contract: heke_coco@126.com
 * Date: 2017/12/2
 * Time: 下午4:55
 */
public class MainTest2 {

    public static void main(String[] args) {
        TreadRun treadRun = new TreadRun();
        treadRun.threadRun();
    }
}

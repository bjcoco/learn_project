package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * TreadRun Created by IntelliJ IDEA.
 * User: heke
 * Contract: heke_coco@126.com
 * Date: 2017/12/2
 * Time: 下午5:02
 */
public class TreadRun {
    private final static ExecutorService exec = Executors.newFixedThreadPool(2);

    static{
        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            public void run() {
                exec.shutdown();
            }
        }));

    }

    public void threadRun() {

        for (int i =0;i<10;i++){
            Run run = new Run();
            exec.execute(run);
        }

        exec.shutdown();
    }
}

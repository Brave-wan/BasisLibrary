package www.jinke.com.library.utils;

/**
 * 作者：root on 17-2-15 09:53
 * <p>
 * 邮箱：185214487@qq.com
 */

public class PriorityRunnable implements Runnable {

    public final Priority priority;//任务优先级
    private final Runnable runnable;//任务真正执行者
    /*package*/ long SEQ;//任务唯一标示

    public PriorityRunnable(Priority priority, Runnable runnable) {
        this.priority = priority == null ? Priority.NORMAL : priority;
        this.runnable = runnable;
    }

    @Override
    public final void run() {
        this.runnable.run();
    }
}

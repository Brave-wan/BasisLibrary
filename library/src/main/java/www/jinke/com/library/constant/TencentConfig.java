package www.jinke.com.library.constant;

import android.app.Application;
import android.content.Context;

import com.tencent.stat.StatConfig;
import com.tencent.stat.StatCrashReporter;
import com.tencent.stat.StatReportStrategy;
import com.tencent.stat.StatService;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * Created by root on 17-7-25.
 */

public class TencentConfig {


    public void initTencent(Application mContext, String AppKey, String platform) {
        // 请在初始化时调用，参数为Application或Activity或Service
        StatService.setContext(mContext);
        // 自动监控Activity生命周期，可以代替之前手动调用的onResume和onPause，防止漏打点的情况
        StatService.registerActivityLifecycleCallbacks(mContext);
        StatConfig.setAppKey(mContext, AppKey);
        // 设置投放渠道，即应用市场，也可通过Manifest配置
        StatConfig.setInstallChannel(mContext, platform);
        //自动捕获程序异常并上传
        StatConfig.setAutoExceptionCaught(true);
        //开启degbug 模式
        StatConfig.setDebugEnable(true);
        // 10分钟上报一次的周期
        StatConfig.setSendPeriodMinutes(10);
        // 选择默认的上报策略
        StatConfig.setStatSendStrategy(StatReportStrategy.PERIOD);
        //
        StatCrashReporter crashReporter = StatCrashReporter.getStatCrashReporter(mContext);
        // 开启异常时的实时上报
        crashReporter.setEnableInstantReporting(true);
        // 开启java异常捕获
        crashReporter.setJavaCrashHandlerStatus(true);
        // 开启Native c/c++，即so的异常捕获
        // 请根据需要添加，记得so文件
        crashReporter.setJniNativeCrashStatus(true);
        //监听网络测速
        testSpeed(mContext);
    }

    /**
     * 自定义事件上报
     *
     * @param mContext 当前对象
     * @param event_id 事件id
     * @param btName   btname
     */
    public static void RegistCustomKV(Context mContext, String event_id, String btName) {
        Properties prop = new Properties();
        prop.setProperty("name", btName);
        StatService.trackCustomKVEvent(mContext, event_id, prop);
    }

    /**
     * @param mContext
     * @param pageName
     */
    public static void onResume(Context mContext, String pageName) {
        StatService.onResume(mContext);
        StatService.trackBeginPage(mContext, pageName);
    }

    /**
     * @param mContext
     * @param pageName
     */
    public static void onPause(Context mContext, String pageName) {
        StatService.onPause(mContext);
        StatService.trackEndPage(mContext, pageName);
    }

    /**
     * 网络测速
     *
     * @param mContext
     */
    public static void testSpeed(Context mContext) {
        Map<String, Integer> map = new HashMap<>();
        map.put("www.qq.com", 80);
        map.put("pingma.qq.com", 80);
        StatService.testSpeed(mContext, map);
    }
}

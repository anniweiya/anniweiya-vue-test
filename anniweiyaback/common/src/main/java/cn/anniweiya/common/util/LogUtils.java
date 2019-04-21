package cn.anniweiya.common.util;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * it seems cause some performance problem
 * Created by anniweiya on 5/30/17.
 */
@Deprecated
public final class LogUtils {

    private static final Map<String, Log> loggerMap = new HashMap<String, Log>();

    private static String getName() {
        StackTraceElement[] callStack = Thread.currentThread().getStackTrace();
        if (null == callStack) {
            return "";
        }

        StackTraceElement caller = null;
        String logClassName = LogUtils.class.getName();
        boolean isEachLogClass = false;

        for (StackTraceElement s : callStack) {
            if (logClassName.equals(s.getClassName())) {
                isEachLogClass = true;
            }
            if (isEachLogClass) {
                if (!logClassName.equals(s.getClassName())) {
                    caller = s;
                    break;
                }
            }
        }
        return "**********" + caller.getClassName() + '.' + caller.getMethodName() + "**********";
    }

    private static Log getLogger() {
        String className = getName();
        Log log;
        if (loggerMap.containsKey(className)) {
            log = loggerMap.get(className);
        } else {
            log = LogFactory.getLog(className);
            loggerMap.put(className, log);
        }
        return log;
    }

    public static void main(String[] args) {
        info("custom log test");
    }

    public static void trace(Object message) {
        getLogger().trace(message);
    }

    public static void trace(Object message, Throwable t) {
        getLogger().trace(message, t);
    }

    public static void debug(Object message) {
        getLogger().debug(message);
    }

    public static void debug(Object message, Throwable t) {
        getLogger().debug(message, t);
    }

    public static void info(Object message) {
        getLogger().info(message);
    }

    public static void info(Object message, Throwable t) {
        getLogger().info(message, t);
    }

    public static void warn(Object message) {
        getLogger().warn(message);
    }

    public static void warn(Object message, Throwable t) {
        getLogger().warn(message, t);
    }

    public static void error(Object message) {
        getLogger().error(message);
    }

    public static void error(Object message, Throwable t) {
        getLogger().error(message, t);
    }

    public static void fatal(Object message) {
        getLogger().fatal(message);
    }

    public static void fatal(Object message, Throwable t) {
        getLogger().fatal(message, t);
    }


}

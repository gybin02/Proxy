/**
 * 反射帮助类
 * @author zhengxiaobin@xiaoyouzi.com
 * @since 16/11/11
 */

public class InjectUtil {
    public static final String INJECT_PATH = "com.lingan.seeyou.ui.activity.user.controller.inject.impl.";
    private static final String TAG = "InjectUtil";

    /**
     * 反射调用实现的回调
     * @param className 反射的实现类名，通常在其他模块中。 类要继承IInjectCallback。
     * @param context
     */
    public static void injectCallback(String className, Context context) {
        Class<?> clazz = null;
        try {
            clazz = Class.forName(className);
            IInjectCallback function = (IInjectCallback) clazz.newInstance();
            function.call(context);
        } catch (Exception e) {
            e.printStackTrace();
            Log.e(TAG, "injectCallback Fail: " + className);
        }
    }

    /**
     * 返回 具体类的接口
     * @param className
     * @param <T> T 传接口
     * @return
     */
    public static <T> T injectClass(String className) {
        Class<?> clazz = null;
        try {
            clazz = Class.forName(className);
            T function = (T) clazz.newInstance();
            return function;
        } catch (Exception e) {
            e.printStackTrace();
            Log.e(TAG, "injectCallback Fail: " + className);
        }
        return null;
    }

package com.lingan.seeyou.ui.activity.user.controller.inject;

import android.content.Context;
import android.util.Log;

/**
 * 反射帮助类
 * @author zhengxiaobin@xiaoyouzi.com
 * @since 16/11/11
 */

public class InjectUtil {
    public static final String INJECT_PATH = "com.lingan.seeyou.ui.activity.user.controller.inject.impl.";
    private static final String TAG = "InjectUtil";

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
}

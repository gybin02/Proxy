# Proxy
Java的动态代理实现

简单讲： 只知道interface接口，但是要执行 具体 Impl 的方法； 

### 使用 反射实现：
com.jet.ui.activity.user.controller.inject.InjectUtil#injectCallback
````
    /**
     * 反射调用实现的回调
     * @param className 反射的实现类名，通常在其他模块中。 类要继承IInjectCallback。
     * @param context
     */
    public static void injectCallback(String className, Context context)
````

### 动态代理： InvocationHandler 实现；


### 问题



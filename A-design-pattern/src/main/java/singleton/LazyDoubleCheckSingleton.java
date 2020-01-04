package singleton;

/**
 * @author Crystal-Chen
 * @Title: LazyDoubleCheckSingleton
 * @Package singleton
 * @Description:
 * @date 2019/12/31 14:15
 */
public class LazyDoubleCheckSingleton {

    private static LazyDoubleCheckSingleton lazyDoubleCheckSingleton;

    private LazyDoubleCheckSingleton() {
        if(lazyDoubleCheckSingleton != null){//防反射破坏单例
            throw new RuntimeException("实例已存在");
        }
    }

    public static LazyDoubleCheckSingleton getInstance() {
        if (lazyDoubleCheckSingleton == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (lazyDoubleCheckSingleton == null) {
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                }
            }
        }
        return lazyDoubleCheckSingleton;
    }

    public void readResolve(){//防序例化破坏单例
        if (lazyDoubleCheckSingleton == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (lazyDoubleCheckSingleton == null) {
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                }
            }
        }
    }
}

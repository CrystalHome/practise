package singleton;

/**
 * @author Crystal-Chen
 * @Title: LazyInnerClass
 * @Package singleton
 * @Description:
 * @date 2019/12/31 14:17
 */
public class LazyInnerClass {

    private static LazyInnerClass lazyInnerClass;

    private LazyInnerClass(){//防反射破坏单例
        if(lazyInnerClass != null){
            throw new RuntimeException("实例已存在");
        }
    }

    public static LazyInnerClass getInstance(){
        if(lazyInnerClass == null){
            lazyInnerClass = HolderClass.INSTANCE;
        }
        return lazyInnerClass;
    }

    private static class HolderClass{
        private static final LazyInnerClass INSTANCE = new LazyInnerClass();
    }

    public void readResolve(){//防序例化破坏单例
        if(lazyInnerClass == null){
            lazyInnerClass = HolderClass.INSTANCE;
        }
    }
}

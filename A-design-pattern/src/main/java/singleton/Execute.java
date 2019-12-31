package singleton;

/**
 * @author Crystal-Chen
 * @Title: Execute
 * @Package singleton
 * @Description:
 * @date 2019/12/31 16:15
 */
public class Execute implements Runnable {

    private static Object threadObj;

    @Override
    public void run() {
        threadObj = LazyInnerClass.getInstance();
//        threadObj = LazyDoubleCheckSingleton.getInstance();
//        threadObj = SingletonHungry2.getInstance();
//        threadObj = SingletonHungry.getInstance();
        System.out.println(Thread.currentThread().getName()+":"+threadObj);
    }

    public static Object getObject(){
        return threadObj;
    }

}

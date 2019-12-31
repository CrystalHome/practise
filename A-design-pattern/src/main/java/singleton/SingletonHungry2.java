package singleton;

/**
 * @author Crystal-Chen
 * @Title: SingletonHungry2
 * @Package singleton
 * @Description:
 * @date 2019/12/31 14:15
 */
public class SingletonHungry2 {

    private final static SingletonHungry2 singletonHungry2;

    static{
        singletonHungry2 = new SingletonHungry2();
    }

    private SingletonHungry2(){}

    public static SingletonHungry2 getInstance(){
        return singletonHungry2;
    }
}

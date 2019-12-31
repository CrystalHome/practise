package singleton;

/**
 * @author Crystal-Chen
 * @Title: SingletonHungry
 * @Package singleton
 * @Description:
 * @date 2019/12/31 14:15
 */
public class SingletonHungry {

    private final static SingletonHungry singletonHungry = new SingletonHungry();

    private SingletonHungry(){}

    public static SingletonHungry getInstance(){
        return singletonHungry;
    }
}

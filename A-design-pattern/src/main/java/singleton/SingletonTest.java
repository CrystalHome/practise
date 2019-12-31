package singleton;

/**
 * @author Crystal-Chen
 * @Title: SingletonTest
 * @Package singleton
 * @Description:
 * @date 2019/12/31 16:11
 */
public class SingletonTest {

    public static void main(String[] args) {
//        singletonHungryTest();
//        singletonHungry2Test();
//        lazyDoubleCheckSingletonTest();
        LazyInnerClassTest();

    }

    public static void LazyInnerClassTest(){
        Thread t1 = new Thread(new Execute());
        Thread t2 = new Thread(new Execute());
        t1.start();
        t2.start();
        System.out.println("==");
    }

    public static void lazyDoubleCheckSingletonTest(){
        Thread t1 = new Thread(new Execute());
        Thread t2 = new Thread(new Execute());
        t1.start();
        t2.start();
        System.out.println("==");
    }

    public static void singletonHungry2Test(){
        Thread t1 = new Thread(new Execute());
        Thread t2 = new Thread(new Execute());
        t1.start();
        t2.start();
        System.out.println("==");
    }

    public static void singletonHungryTest(){
        Thread t1 = new Thread(new Execute());
        Thread t2 = new Thread(new Execute());
        t1.start();
        t2.start();
        System.out.println("==");
    }
}

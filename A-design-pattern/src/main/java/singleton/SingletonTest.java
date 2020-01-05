package singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

/**
 * @author Crystal-Chen
 * @Title: SingletonTest
 * @Package singleton
 * @Description:
 * @date 2019/12/31 16:11
 */
public class SingletonTest {

    public static <T> T reflect(Class<T> clazz){
        try {
            Constructor constructor = clazz.getDeclaredConstructor(null);
            constructor.setAccessible(true);
            Object object = constructor.newInstance();
            return  (T) object;
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    public static <T> T serializable(T obj){
        try {
            FileOutputStream fos = new FileOutputStream("serializable.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(obj);
            oos.flush();
            oos.close();

            FileInputStream fis = new FileInputStream("serializable.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            T serializableObj = (T)ois.readObject();
            return serializableObj;
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
//        singletonHungryTest();
//        singletonHungry2Test();
//        lazyDoubleCheckSingletonTest();
//        LazyInnerClassTest();
        SingletonEnumTest();
    }

    public static void SingletonEnumTest(){
        SingletonEnum singletonEnum1 = SingletonEnum.getInstance();
        SingletonEnum singletonEnum2 = SingletonEnum.getInstance();
        System.out.println(singletonEnum1 == singletonEnum2);
/*
        SingletonEnum reflect1 = reflect(SingletonEnum.class);
        System.out.println(reflect1 == singletonEnum1);
        System.out.println(reflect1 == singletonEnum2);
        */

        SingletonEnum serializableObj = serializable(singletonEnum1);
        System.out.println(serializableObj == singletonEnum1);
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

package singleton;

import java.io.Serializable;

/**
 * @author Crystal-Chen
 * @Title: SingletonEnum
 * @Description:
 * @date 2020/1/5 1:12
 */
public class SingletonEnum implements Serializable {

    private SingletonEnum(){//防反射破坏单例
        if(InnerEnum.INSTANCE != null){
            throw new RuntimeException("实例已存在");
        }
    }

    public Object readResolve(){//防序例化破坏单例
        return InnerEnum.INSTANCE.getInstance();
    }

    public static SingletonEnum getInstance(){
        return InnerEnum.INSTANCE.getInstance();
    }

    private enum  InnerEnum {
        INSTANCE;
        private SingletonEnum singletonEnum;

        InnerEnum(){
            this.singletonEnum = new SingletonEnum();
        }

        public SingletonEnum getInstance(){
            return this.singletonEnum;
        }
    }
}

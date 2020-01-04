package singleton;

/**
 * @author Crystal-Chen
 * @Title: SingletonEnum
 * @Description:
 * @date 2020/1/5 1:12
 */
public class SingletonEnum {

    private SingletonEnum(){}

    public static SingletonEnum getInstance(){
        return InnerEnum.INSTANCE.getInstance();
    }

    private enum  InnerEnum {
        INSTANCE;
        private SingletonEnum singletonEnum;

        public SingletonEnum getInstance(){
            return this.singletonEnum;
        }

        InnerEnum(){
            this.singletonEnum = new SingletonEnum();
        }
    }
}

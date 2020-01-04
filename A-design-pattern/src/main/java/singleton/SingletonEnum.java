package singleton;

/**
 * @author Crystal-Chen
 * @Title: SingletonEnum
 * @Description:
 * @date 2020/1/5 1:12
 */
public enum  SingletonEnum {
    INSTANCE;
    private DataSource dataSource;

    public DataSource getInstance(){
        return this.dataSource;
    }

    SingletonEnum(){
        this.dataSource = new DataSource();
    }
}

package singleton;

import java.util.StringJoiner;

/**
 * @author Crystal-Chen
 * @Title: DataSource
 * @Description:
 * @date 2020/1/5 1:12
 */
public class DataSource {

    private String url;
    private String driver;
    private String userName;
    private String password;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", DataSource.class.getSimpleName() + "[", "]")
                .add("url='" + url + "'")
                .add("driver='" + driver + "'")
                .add("userName='" + userName + "'")
                .add("password='" + password + "'")
                .toString();
    }
}

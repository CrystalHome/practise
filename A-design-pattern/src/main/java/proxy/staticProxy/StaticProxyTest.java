package proxy.staticProxy;

/**
 * @author Crystal-Chen
 * @Title: StaticProxyTest
 * @Description:
 * @date 2020/1/5 16:59
 */
public class StaticProxyTest {

    public static void main(String[] args) {
        BaiduProxy baiduProxy = new BaiduProxy(new Baidu());
        baiduProxy.recruit(new Tom());
    }
}

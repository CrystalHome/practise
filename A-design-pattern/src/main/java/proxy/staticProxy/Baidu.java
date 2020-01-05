package proxy.staticProxy;

import proxy.modelproxy.Company;

/**
 * @author Crystal-Chen
 * @Title: Baidu
 * @Description:
 * @date 2020/1/5 16:52
 */
public class Baidu implements Company {
    @Override
    public void recruit() {
        System.out.println(this.getClass().getName()+"招聘员工");
    }
}

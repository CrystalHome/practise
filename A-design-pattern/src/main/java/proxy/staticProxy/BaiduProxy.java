package proxy.staticProxy;


import proxy.modelproxy.Company;
import proxy.modelproxy.Person;

/**
 * @author Crystal-Chen
 * @Title: BaiduProxy
 * @Description:
 * @date 2020/1/5 16:48
 */
public class BaiduProxy {

    private Company company;

    public BaiduProxy(Company company){
        this.company = company;
    }

    public void recruit(Person person){
        company.recruit();
        person.findWork();
        System.out.println("办理入职");
    }
}

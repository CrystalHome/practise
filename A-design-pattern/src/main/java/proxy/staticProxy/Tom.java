package proxy.staticProxy;

import proxy.modelproxy.Person;

/**
 * @author Crystal-Chen
 * @Title: Tom
 * @Description:
 * @date 2020/1/5 16:46
 */
public class Tom implements Person {

    @Override
    public void findWork() {
        System.out.println(this.getClass().getName()+"找工作");
    }
}

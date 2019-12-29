package factory.model;

/**
 * @author Crystal-Chen
 * @Title: BmwCard
 * @Description: 宝马汽车
 * @date 2019/12/29 0:29
 */
public class BmwCard implements ICard{
    @Override
    public void getBrand() {
        System.out.println("汽车品牌是:宝马");
    }
}

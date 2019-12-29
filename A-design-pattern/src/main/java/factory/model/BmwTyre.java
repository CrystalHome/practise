package factory.model;

/**
 * @author Crystal-Chen
 * @Title: BmwTyre
 * @Description: 宝马轮胎
 * @date 2019/12/29 16:12
 */
public class BmwTyre implements ITyre {
    @Override
    public void getBrand() {
        System.out.println("轮胎品牌是:宝马");
    }
}

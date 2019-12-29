package factory.model;

/**
 * @author Crystal-Chen
 * @Title: AudiTyre
 * @Description: 奥迪轮胎
 * @date 2019/12/29 16:12
 */
public class AudiTyre implements ITyre {
    @Override
    public void getBrand() {
        System.out.println("轮胎品牌是:奥迪");
    }
}

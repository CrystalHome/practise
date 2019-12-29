package factory.model;

/**
 * @author Crystal-Chen
 * @Title: AudiCard
 * @Description: 奥迪汽车
 * @date 2019/12/29 0:37
 */
public class AudiCard implements ICard{
    @Override
    public void getBrand() {
        System.out.println("汽车品牌是:奥迪");
    }
}

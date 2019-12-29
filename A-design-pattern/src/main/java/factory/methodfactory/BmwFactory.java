package factory.methodfactory;

import factory.model.BmwCard;
import factory.model.ICard;

/**
 * @author Crystal-Chen
 * @Title: BmwFactory
 * @Description: 宝马汽车厂，制造宝马汽车
 * @date 2019/12/29 1:37
 */
public class BmwFactory extends FactoryMethod {
    @Override
    public ICard getCard() {
        return new BmwCard();
    }
}

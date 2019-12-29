package factory.abstrfactory;

import factory.model.BmwCard;
import factory.model.BmwTyre;
import factory.model.ICard;
import factory.model.ITyre;

/**
 * @author Crystal-Chen
 * @Title: BmwFactory
 * @Description: 宝马工厂
 * @date 2019/12/29 16:26
 */
public class BmwFactory extends AbstrFactory {
    @Override
    ICard createCard() {
        return new BmwCard();
    }

    @Override
    ITyre createTyre() {
        return new BmwTyre();
    }
}

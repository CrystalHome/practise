package factory.abstrfactory;

import factory.model.AudiCard;
import factory.model.AudiTyre;
import factory.model.ICard;
import factory.model.ITyre;

/**
 * @author Crystal-Chen
 * @Title: AudiFactory
 * @Description: 奥迪工厂
 * @date 2019/12/29 16:24
 */
public class AudiFactory extends AbstrFactory {
    @Override
    ICard createCard() {
        return new AudiCard();
    }

    @Override
    ITyre createTyre() {
        return new AudiTyre();
    }
}

package factory.methodfactory;

import factory.model.AudiCard;
import factory.model.ICard;

/**
 * @author Crystal-Chen
 * @Title: AudiFactory
 * @Description: 奥迪汽车厂，制造奥迪汽车
 * @date 2019/12/29 1:39
 */
public class AudiFactory extends FactoryMethod {
    @Override
    public ICard getCard() {
        return new AudiCard();
    }
}

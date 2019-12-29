package factory.simplefactory;

import factory.model.AudiCard;
import factory.model.BmwCard;
import factory.model.ICard;

/**
 * @author Crystal-Chen
 * @Title: SimpleFactoryTest
 * @Description: 简单工厂模式测试
 * @date 2019/12/29 0:33
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();

        ICard bmw = simpleFactory.getCardByBrand("BMW");
        bmw.getBrand();
        ICard audi = simpleFactory.getCardByBrand("AUDI");
        audi.getBrand();

        System.out.println("=============================================================================");

        ICard bmw2 = simpleFactory.getCardByClassName(BmwCard.class.getName());
        bmw2.getBrand();
        ICard audi2 = simpleFactory.getCardByClassName(AudiCard.class.getName());
        audi2.getBrand();

        System.out.println("=============================================================================");

        ICard bmw3 = simpleFactory.getCardByClass(BmwCard.class);
        bmw3.getBrand();
        ICard audi3 = simpleFactory.getCardByClass(AudiCard.class);
        audi3.getBrand();

    }
}

package factory.methodfactory;

import factory.model.ICard;

/**
 * @author Crystal-Chen
 * @Title: FactoryMethodTest
 * @Description: 工厂方法模式测试
 * @date 2019/12/29 1:41
 */
public class FactoryMethodTest {

    public static void main(String[] args) {
        FactoryMethod bmwFactory = new BmwFactory();
        ICard bmw = bmwFactory.getCard();
        bmw.getBrand();

        System.out.println("=============================================================================");

        FactoryMethod audiFactory = new AudiFactory();
        ICard audi = audiFactory.getCard();
        audi.getBrand();

    }
}

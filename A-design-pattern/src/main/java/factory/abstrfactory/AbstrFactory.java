package factory.abstrfactory;

import factory.model.ICard;
import factory.model.ITyre;

/**
 * @author Crystal-Chen
 * @Title: AbstrFactory
 * @Description: 抽象工厂方法模式(需要了解产品族和产品等级关系)
 *                  汽车集团业务扩展了，除了需要制造更多类型的汽车，还要制造轮胎等业务，每个子工厂制造一种类型的汽车，还需要制造对应的轮胎等产品。
 * 优点：
 *  顶级工厂定义所有工厂方法，扩展性强
 *
 * 缺点：
 *  工厂类较多，增加代码结构复杂度；
 *  增加了系统抽象性，理解难度增加；
 *  工厂新增产品时，需要修改顶级类，影响大，违背开闭原则；
 * @date 2019/12/29 0:53
 */
//可以是接口，也可以是抽象类。抽象类可以方便扩展，多继承单实现机制
abstract class AbstrFactory {

    abstract ICard createCard();

    abstract ITyre createTyre();
}

package factory.methodfactory;

import factory.model.ICard;

/**
 * @author Crystal-Chen
 * @Title: FactoryMethod
 * @Description: 工厂方法模式
 *                  汽车工厂业务扩展了，需要制造更多类型的汽车，工厂升级为集团，开设子工厂，每个子工厂制造一种类型的汽车。
 * 优点：
 *  用户只需要关心新产品对应的工厂，无须关心创建细节;
 *  一个工厂只做一件事，符合单一原则；
 *  扩展新产品只需要新增对应产品工厂，可扩展性高，符合开闭原则;
 *
 * 缺点：
 *  工厂类较多，增加代码结构复杂度；
 *  增加了系统抽象性，理解难度增加；
 * @date 2019/12/29 0:53
 */
//可以是接口，也可以是抽象类。抽象类可以方便扩展，多继承单实现机制
abstract class FactoryMethod {

    abstract ICard getCard();
}

package factory.simplefactory;

import factory.model.AudiCard;
import factory.model.BmwCard;
import factory.model.ICard;
import org.apache.commons.lang3.StringUtils;

/**
 * @author Crystal-Chen
 * @Title: SimpleFactory
 * @Description: 简单工厂模式
 *                  汽车工厂，有一个条流水线制造汽车。汽车工厂业务扩展了，需要制造更多类型的汽车，就需要增加修改流水线里面各岗位,职责太重，维护成功较大。(需要升级)
 * 优点：
 *  只需传入一个正确的参数，就可以获取想要的对象，无需要关系创建细节;
 *
 * 缺点：
 *  扩展产品时，需要修改工厂方法,违背开闭原则。
 *  扩展产品时，工厂创建产品类型较多，职责过重，违背单一原则；
 * @date 2019/12/29 0:18
 */
public class SimpleFactory {

    /**
    * @Description: 通过品牌名创建对应的汽车
    */
    public ICard getCardByBrand(String brand){
        if(StringUtils.equals(brand,"BMW")){
            return new BmwCard();
        }
        if(StringUtils.equals(brand,"AUDI")){
            return new AudiCard();
        }
        return null;
    }

    /**
    * @Description: 通过Class名创建
    */
    public ICard getCardByClassName(String className){
       if(StringUtils.isNotBlank(className)){
           try {
               ICard card = (ICard) Class.forName(className).newInstance();
               return card;
           }catch (Exception e){
                e.printStackTrace();
           }
       }
        return null;
    }

    /**
    * @Description: 通过Class创建
    */
    public ICard getCardByClass(Class clazz){
       if(clazz != null){
           try {
               ICard card = (ICard) clazz.newInstance();
               return card;
           }catch (Exception e){
                e.printStackTrace();
           }
       }
        return null;
    }
}

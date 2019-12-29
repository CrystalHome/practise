package factory.abstrfactory;

/**
 * @author Crystal-Chen
 * @Title: AbstrFactoryTest
 * @Description: 抽象工厂模式测试
 * @date 2019/12/29 16:27
 */
public class AbstrFactoryTest {

    public static void main(String[] args) {
        AbstrFactory audiFactory = new AudiFactory();
        audiFactory.createCard().getBrand();
        audiFactory.createTyre().getBrand();

        System.out.println("=============================================================================");

        AbstrFactory bmwFactory = new BmwFactory();
        bmwFactory.createCard().getBrand();
        bmwFactory.createTyre().getBrand();
    }
}

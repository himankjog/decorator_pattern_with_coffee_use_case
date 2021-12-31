import decorators.condiment.Mocha;
import decorators.condiment.Soy;
import decorators.condiment.Whip;
import lombok.extern.log4j.Log4j2;
import models.beverage.Beverage;
import models.beverage.Espresso;
import models.beverage.HouseBlend;
import models.beverage.Latte;
import models.enums.Size;

@Log4j2
public class StarbuzzApplication {
    private static final String DESCRIPTION_FORMAT = "{}: ${}";
    public static void main(String[] args) {
        final Beverage espresso = new Espresso(Size.GRANDE);
        log.info(DESCRIPTION_FORMAT, espresso.getDescription(), espresso.getCost());

        Beverage doubleMochaHouseBlendWithWhip = new HouseBlend(Size.TALL);
        doubleMochaHouseBlendWithWhip = new Mocha(doubleMochaHouseBlendWithWhip);
        doubleMochaHouseBlendWithWhip = new Mocha(doubleMochaHouseBlendWithWhip);
        doubleMochaHouseBlendWithWhip = new Whip(doubleMochaHouseBlendWithWhip);

        log.info(DESCRIPTION_FORMAT, doubleMochaHouseBlendWithWhip.getDescription(), doubleMochaHouseBlendWithWhip.getCost());

        Beverage mochaLatteWithSoyAndWhip = new Latte(Size.VENTI);
        mochaLatteWithSoyAndWhip = new Mocha(mochaLatteWithSoyAndWhip);
        mochaLatteWithSoyAndWhip = new Soy(mochaLatteWithSoyAndWhip);
        mochaLatteWithSoyAndWhip = new Whip(mochaLatteWithSoyAndWhip);

        log.info(DESCRIPTION_FORMAT, mochaLatteWithSoyAndWhip.getDescription(), mochaLatteWithSoyAndWhip.getCost());
    }
}

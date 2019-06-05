package coffee.app.main;

import io.dinject.SystemContext;

public class CoffeeApp {

    public static void main(String[] args) {

        var maker = SystemContext.getBean(CoffeeMaker.class);
        maker.brew();

//        var coffeeMaker = new CoffeeMaker(heater, pump);
//        coffeeMaker.brew();
    }
}

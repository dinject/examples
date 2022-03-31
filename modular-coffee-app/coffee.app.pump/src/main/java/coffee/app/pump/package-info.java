@InjectModule(name = "coffee-pump", requires = Heater.class, provides = Pump.class) //requires =
package coffee.app.pump;

import coffee.app.heater.Heater;
import io.avaje.inject.InjectModule;

@InjectModule(name = "coffee-main", requires = {Heater.class, Pump.class}) //, dependsOn = {"coffee-pump", "coffee-heater"})
package coffee.app.main;

import coffee.app.heater.Heater;
import coffee.app.pump.Pump;
import io.avaje.inject.InjectModule;

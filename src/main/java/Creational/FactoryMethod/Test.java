package Creational.FactoryMethod;

import java.util.Calendar;

public class Test {
    Calendar calendarGetInstance = Calendar.getInstance();
    Calendar calendarBuilder = new Calendar.Builder().build();
}

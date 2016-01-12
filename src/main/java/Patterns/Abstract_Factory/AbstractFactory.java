package Patterns.Abstract_Factory;

 interface EngineryFactory {
    public Tank createTank();
    public Aircraft createAircraft();
}
 abstract class Tank {
    private int speed;
    private int power;
    public int getSpeed() {
    return speed;
    }
    public void setSpeed(int speed) {
    this.speed = speed;
     }
    public int getPower() {
        return power;
    }
    public void setPower(int power) {
        this.power = power;
    }
    public abstract String getDescription();
}
 abstract class Aircraft {
    int speed;
    int power;
    int altitude;
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public int getPower() {
        return power;
    }
    public void setPower(int power) {
        this.power = power;
    }
    public int getAltitude() {
        return altitude;
    }
    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }
    public abstract String getDescription();
}
 class USSREngineryFactory implements EngineryFactory {
    public Tank createTank() {
        return new Abrams_Tank();
    }
    public Aircraft createAircraft() {
        return new F_16_Aircraft();
    }
}
class Abrams_Tank extends Tank {
    private static final String NAME = "Abrams";
    private static final String COUNTRY = "USA";
    public String getDescription() {
        return NAME + " " + COUNTRY;
    }
}
 class F_16_Aircraft extends Aircraft {
   private static final String NAME = "F_16";
    private static final String COUNTRY = "USA";
    public String getDescription() {
        return NAME + " " + COUNTRY;
    }
}
 class GermanEngineryFactory implements EngineryFactory {
    public Tank createTank() {
        return new Bulat_Tank();
    }
    public Aircraft createAircraft() {
        return new Mig_29_Aircraft();
    }
}
 class Bulat_Tank extends Tank {
    private static final String NAME = "Bulat";
    private static final String COUNTRY = "UA";
    public String getDescription() {
        return NAME + " " + COUNTRY;
    }
}
 class Mig_29_Aircraft extends Aircraft {
    private static final String NAME = "Mig_29";
    private static final String COUNTRY = "UA";
    public String getDescription() {
        return NAME + " " + COUNTRY;
    }
}
public class AbstractFactory {
    public static void main(String[] args) {
        EngineryFactory engineryFactory = new USSREngineryFactory();
        System.out.println("USA enginery:");
        showEnginery(engineryFactory);
        System.out.println();
        System.out.println("UA enginery:");
        engineryFactory = new GermanEngineryFactory();
        showEnginery(engineryFactory);
    }
    public static void showEnginery(EngineryFactory engineryFactory) {
        Tank tank = engineryFactory.createTank();
        System.out.println(tank.getDescription());
        Aircraft aircraft = engineryFactory.createAircraft();
        System.out.println(aircraft.getDescription());

    }
}

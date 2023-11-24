package Interfaces;

enum FlightStages implements Trackable {GROUNDED, LAUNCH, CRUISE, DATA_COLLECTION;

    @Override
    public void track() {
        if (this != GROUNDED) {
            System.out.println("Monitoring " + this);
        }
    }
}


record DragonFly(String name, String type) implements FlightEnabled {
    @Override
    public void takeOff() {

    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }
}

class Satellite implements OrbitEarth {
    public void achieveOrbit() {
        System.out.println("Orbit achieved!");
    };

    @Override
    public void takeOff() {

    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }
}
interface OrbitEarth extends FlightEnabled {
    void achieveOrbit();
}
interface FlightEnabled {

    // note that no need to declare methods as 'public' or 'abstract' as these are implicit when
    // we set up a method in an interface.
    // All members on an interface are implicitly public.

    double MILES_TO_KM = 1.60934;
    double KM_TO_MILES = .621371;
     void takeOff();
    void land();
    void fly();
}

interface Trackable {
    void track();
}

public abstract class Animal {
    public abstract void move();
}

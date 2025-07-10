package labs_examples.objects_classes_methods.labs.objects;

class PowerPlant {
    private int engines = 4;
    private String engineMfg;
    private String engineModel;

    public PowerPlant(int engines, String engineMfg, String engineModel) {
        this.engines = engines;
        this.engineMfg = engineMfg;
        this.engineModel = engineModel;
    }

    public int getEngines() {
        return engines;
    }

    public void setEngines(int engines) {
        this.engines = engines;
    }

    public String getEngineMfg() {
        return engineMfg;
    }

    public void setEngineMfg(String engineMfg) {
        this.engineMfg = engineMfg;
    }

    public String getEngineModel() {
        return engineModel;
    }

    public void setEngineModel(String engineModel) {
        this.engineModel = engineModel;
    }

    @Override
    public String toString() {
        return "PowerPlant{" +
                "engines=" + engines +
                ", engineMfg='" + engineMfg + '\'' +
                ", engineModel='" + engineModel + '\'' +
                '}';
    }
}

class Dimensions {
   private int wingSpan;

    public Dimensions(int wingSpan) {
        this.wingSpan = wingSpan;
    }

    public int getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(int wingSpan) {
        this.wingSpan = wingSpan;
    }

    @Override
    public String toString() {
        return "Dimensions{" +
                "wingSpan=" + wingSpan +
                '}';
    }
}

class Occupancy {
    private int crew;
    private int passengers;

    public Occupancy(int crew, int passengers) {
        this.crew = crew;
        this.passengers = passengers;
    }

    public int getCrew() {
        return crew;
    }

    public void setCrew(int crew) {
        this.crew = crew;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    @Override
    public String toString() {
        return "Occupancy{" +
                "crew=" + crew +
                ", passengers=" + passengers +
                '}';
    }
}

class Interior {
    private int cabinWidth;
    private int internalBaggage;

    public Interior(int cabinWidth, int internalBaggage) {
        this.cabinWidth = cabinWidth;
        this.internalBaggage = internalBaggage;
    }

    public int getCabinWidth() {
        return cabinWidth;
    }

    public void setCabinWidth(int cabinWidth) {
        this.cabinWidth = cabinWidth;
    }

    public int getInternalBaggage() {
        return internalBaggage;
    }

    public void setInternalBaggage(int internalBaggage) {
        this.internalBaggage = internalBaggage;
    }

    @Override
    public String toString() {
        return "Interior{" +
                "cabinWidth=" + cabinWidth +
                ", internalBaggage=" + internalBaggage +
                '}';
    }
}

class Fuel {
    private double fuelCapacity;
    private double currentFuelLevel;

    public Fuel(double fuelCapacity, double currentFuelLevel) {
        this.fuelCapacity = fuelCapacity;
        this.currentFuelLevel = currentFuelLevel;
    }

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public double getCurrentFuelLevel() {
        return currentFuelLevel;
    }

    public void setCurrentFuelLevel(double currentFuelLevel) {
        this.currentFuelLevel = currentFuelLevel;
    }

    @Override
    public String toString() {
        return "Fuel{" +
                "fuelCapacity=" + fuelCapacity +
                ", currentFuelLevel=" + currentFuelLevel +
                '}';
    }
}

class Airplane {

    private PowerPlant powerPlant;
    private Dimensions dimensions;
    private Occupancy occupancy;
    private Interior interior;
    private Fuel fuel;

    public Airplane(PowerPlant powerPlant, Dimensions dimensions, Occupancy occupancy, Interior interior, Fuel fuel) {
        this.powerPlant = powerPlant;
        this.dimensions = dimensions;
        this.occupancy = occupancy;
        this.interior = interior;
        this.fuel = fuel;
    }

    public PowerPlant getPowerPlant() {
        return powerPlant;
    }

    public void setPowerPlant(PowerPlant powerPlant) {
        this.powerPlant = powerPlant;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public void setDimensions(Dimensions dimensions) {
        this.dimensions = dimensions;
    }

    public Occupancy getOccupancy() {
        return occupancy;
    }

    public void setOccupancy(Occupancy occupancy) {
        this.occupancy = occupancy;
    }

    public Interior getInterior() {
        return interior;
    }

    public void setInterior(Interior interior) {
        this.interior = interior;
    }

    public Fuel getFuel() {
        return fuel;
    }

    public void setFuel(Fuel fuel) {
        this.fuel = fuel;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "powerPlant=" + powerPlant +
                ", dimensions=" + dimensions +
                ", occupancy=" + occupancy +
                ", interior=" + interior +
                ", fuel=" + fuel +
                '}';
    }
}

class AirplaneController {
    public static void main(String[] args) {
        PowerPlant engine = new PowerPlant(4, "Pratt & Whitney", "JT9D-7A/-7F/-7J");
        Dimensions dimension = new Dimensions(5500);
        Occupancy occupancy = new Occupancy(3, 539);
        Interior interior = new Interior(20, 6190);
        Fuel fuel = new Fuel(57.285, 30.500);

        Airplane trumpAir = new Airplane(engine, dimension, occupancy, interior, fuel);

        System.out.println("Trump Airlines....powered by " + engine.getEngines() + " engines. " + "Airliner has a wing span of " + dimension.getWingSpan() + " sqft, " +
                occupancy.getPassengers() + " passenger spacious seating, with a interior cabin of " + interior.getCabinWidth() + " sqft wide, " +  "finally the fuselage has a fuel capacity of " + fuel.getFuelCapacity() + " gallons.");
        System.out.println("****************************************");
        System.out.println(trumpAir.toString());
    }
}

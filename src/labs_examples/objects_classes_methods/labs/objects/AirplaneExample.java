package labs_examples.objects_classes_methods.labs.objects;

class AirplaneExample {

    public static void main(String[] args) {
        //main method
        Fuselage fuselage = new Fuselage(940, 5179);
        PlaneEngine planeEngine = new PlaneEngine(253200);
        Wings wings = new Wings(541);
        LandingGear landingGear = new LandingGear(16, 52);

        Airplane myPlane = new Airplane(216840, 200000, planeEngine,
                fuselage, wings, landingGear, "Boeing 747");

        LandingGear newLandingGear = new LandingGear(20, 68);
        myPlane.setLandingGear(newLandingGear);

        myPlane.setModel("Boeing 757");

        System.out.println("I am traveling in a " + myPlane.getModel()+ " which can hold "+
                myPlane.getFuselage().getPassengerCapacity() + " passengers and many bags in its fuselage of "
                +myPlane.getFuselage().getSquareFeet()+" square feet.");

        System.out.println(myPlane.toString());
    }

}

class Airplane{
    private double fuelCapacity;
    private double currentFuelLevel;
    private PlaneEngine engineName;
    private Fuselage fuselage;
    private Wings wings;
    private LandingGear landingGear;
    private String model;

    public Airplane(double fuelCapacity, double currentFuelLevel, PlaneEngine engineName, Fuselage fuselage,
            Wings wings, LandingGear landingGear,String model){
        this.fuelCapacity = fuelCapacity;
        this.currentFuelLevel = currentFuelLevel;
        this.engineName = engineName;
        this.fuselage = fuselage;
        this.wings = wings;
        this.landingGear = landingGear;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "fuelCapacity=" + fuelCapacity +
                ", currentFuelLevel=" + currentFuelLevel +
                ", engineName=" + engineName + "\n"+
                ", fuselage=" + fuselage +
                ", wings=" + wings +
                ", landingGear=" + landingGear + "\n"+
                ", model='" + model + '\'' +
                '}';
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

    public PlaneEngine getEngineName() {
        return engineName;
    }

    public void setEngineName(PlaneEngine engineName) {
        this.engineName = engineName;
    }

    public Fuselage getFuselage() {
        return fuselage;
    }

    public void setFuselage(Fuselage fuselage) {
        this.fuselage = fuselage;
    }

    public Wings getWings() {
        return wings;
    }

    public void setWings(Wings wings) {
        this.wings = wings;
    }

    public LandingGear getLandingGear() {
        return landingGear;
    }

    public void setLandingGear(LandingGear landingGear) {
        this.landingGear = landingGear;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}

class Fuselage{
    private int passengerCapacity;
    private double squareFeet;

    public Fuselage(int passengerCapacity, double squareFeet){
        this.passengerCapacity = passengerCapacity;
        this.squareFeet = squareFeet;
    }

    @Override
    public String toString() {
        return "Fuselage{" +
                "passengerCapacity=" + passengerCapacity +
                ", squareFeet=" + squareFeet +
                '}';
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public double getSquareFeet() {
        return squareFeet;
    }

    public void setSquareFeet(double squareFeet) {
        this.squareFeet = squareFeet;
    }
}

class PlaneEngine{
    private int thrust;

    public PlaneEngine(int thrust){
        this.thrust = thrust;
    }

    @Override
    public String toString() {
        return "PlaneEngine{" +
                "thrust=" + thrust +
                '}';
    }

    public int getThrust() {
        return thrust;
    }

    public void setThrust(int thrust) {
        this.thrust = thrust;
    }
}

class Wings{
    private int area;

    public Wings(int area){
        this.area = area;
    }

    @Override
    public String toString() {
        return "Wings{" +
                "area=" + area +
                '}';
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }
}

class LandingGear{
    private int wheelNumber;
    private int wheelDiameter;

    public LandingGear(int wheelNumber, int wheelDiameter){
        this.wheelNumber = wheelNumber;
        this.wheelDiameter = wheelDiameter;
    }

    @Override
    public String toString() {
        return "LandingGear{" +
                "wheelNumber=" + wheelNumber +
                ", wheelDiameter=" + wheelDiameter +
                '}';
    }

    public int getWheelNumber() {
        return wheelNumber;
    }

    public void setWheelNumber(int wheelNumber) {
        this.wheelNumber = wheelNumber;
    }

    public int getWheelDiameter() {
        return wheelDiameter;
    }

    public void setWheelDiameter(int wheelDiameter) {
        this.wheelDiameter = wheelDiameter;
    }
}





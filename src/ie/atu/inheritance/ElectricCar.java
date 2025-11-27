package ie.atu.inheritance;

public class ElectricCar extends Car {
    private int batteryCapacity;

    public ElectricCar(String type, int doors, int batteryCapacity){
        super(type, doors);
        this.batteryCapacity=batteryCapacity;
    }
    public int getBatteryCapacity(){
        return batteryCapacity;
    }
    public void setBattery(int input){
        batteryCapacity=input;
    }
    public void charging(){
        System.out.println("Charging...");
    }
}

package ie.atu.inheritance;

public class Vehicle {
    private String type;

    public void setType(String input){
        type=input;
    }
    public String getType(){
        return type;
    }
    public Vehicle(String type){
        this.type=type;
    }
    public void isMoving(){
        System.out.println("The vehicle is moving");
    }
}

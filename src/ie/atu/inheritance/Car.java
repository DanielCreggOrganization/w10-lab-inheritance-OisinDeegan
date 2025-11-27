package ie.atu.inheritance;

public class Car extends Vehicle{
    private int doors;
    public void playingRadio(){
        System.out.println("The radio is playing");
    }

    public Car(String type, int doors){
        super(type);
        this.doors=doors;
    }

    public int getDoors(){
        return doors;
    }

    public void setDoors(int input){
        input=doors;
    }
    public void beep(){
        System.out.println("HOOOOONK!!");
    }
}

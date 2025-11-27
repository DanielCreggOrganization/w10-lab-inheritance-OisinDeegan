package ie.atu.inheritance;

public class Motorbike extends Vehicle{
    private boolean hasSideCar;
    public Motorbike(String type, boolean hasSideCar){
        super(type);
        this.hasSideCar=hasSideCar;
    }

    public void setSideCar(boolean input){
        input=hasSideCar;
    }
    public boolean getSideCar(){
        return hasSideCar;
    }
    public void ride(){
        if (hasSideCar) {
            System.out.println("Riding my "+getType()+"(which has a sidecar)");
        } else {
            System.out.println("Riding my "+getType()+"(which does not have a sidecar)");
        }
    }
}

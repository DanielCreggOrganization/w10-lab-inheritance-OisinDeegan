package ie.atu.inheritance;

public class Main {
    
    public static void main(String[] args) {
        Dog finn = new Dog();   
        finn.setName("Finn");
        finn.setSpecies("Dog");

        System.out.println(finn.getName()+" "+finn.getSpecies());
        ElectricCar edison = new ElectricCar("Car", 3, 24000);
        edison.beep();
        edison.isMoving();
        edison.charging();
        System.out.println("The "+edison.getType()+" has "+edison.getDoors()+" door(s) and has a battery capacity of "+edison.getBatteryCapacity()+"kWh");

        Gadget gad = new Gadget();

        gad.toString();
        gad.hashCode();

        Student stu1 = new Student("G00465926", "Oisin Deegan", 19);

        System.out.println(stu1.getAge()+stu1.getName()+stu1.getStudentId());
    }
}

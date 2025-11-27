package ie.atu.inheritance;

public class Person {
    private int age;
    private String name;

    public Person(int age, String name){
        this.age=age;
        this.name=name;
    }

    public void setName(String input){
        input = name;
    }
    public void setAge(int input){
        input=age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}

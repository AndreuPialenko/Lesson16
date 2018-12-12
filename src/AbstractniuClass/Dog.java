package AbstractniuClass;

public class Dog extends Animal{
    public String poroda;
    Dog(String name, String poroda){
        super(name);
        this.poroda = poroda;
    }

    @Override
    public void eat(){
        System.out.println("dog eats");
    }
}

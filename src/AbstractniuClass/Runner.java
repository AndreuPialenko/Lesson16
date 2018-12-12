package AbstractniuClass;

public class Runner {
    public static void main(String[] args) {
        Dog d1 = new Dog("Rex", "Ovcharka");
        Dog d2 = new Dog("lol", "Pudel");
        
        d1.eat();

        Animal lev = new Animal() {
            @Override
            public void eat() {
                System.out.println(this.getName + " eats");
            }
        };
        lev.eat();
    }
}

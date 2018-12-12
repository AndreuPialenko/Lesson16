import java.util.ArrayList;
import java.util.List;

public class Elka {
    public String name;
    private List<Toy> toys = new ArrayList<>();

    public Elka(String name, List<Toy> toys) {
        this.name = name;
        this.toys = toys;
    }

    public Elka(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Toy> getToys() {
        return toys;
    }

    public void setToys(List<Toy> toys) {
        this.toys = toys;
    }


    public void addToy(Toy toy){
        toys.add(toy);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Elka elka = (Elka) o;

        if (!name.equals(elka.name)) return false;
        return toys.equals(elka.toys);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + toys.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Elka{" +
                "name='" + name + '\'' +
                ", toys=" + toys +
                '}';
    }

    public int countToysOfColor(Color color){
        int counter = 0;
        for (Toy toy: toys){
            if (color==toy.getColor()){
                counter++;
            }
        }
        return counter;
    }


}

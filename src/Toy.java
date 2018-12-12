import java.util.Collection;
import java.util.Collections;

abstract class Toy implements Comparable<Toy> {
    private String name;
    private Color color;
    private Shape shape;

    public Toy(String name, Color color, Shape shape) {
        this.name = name;
        this.color = color;
        this.shape = shape;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    @Override
    public int compareTo(Toy toy){
        return this.name.compareTo(toy.name);
    }



}

public class Figure extends Toy{
    private final boolean isFigureOfMen;

    public Figure(String name, Color color, boolean isFigureOfMen) {
        super(name, color, Shape.FIGURE);
                this.isFigureOfMen = isFigureOfMen;
    }

    public boolean isFigureOfMen() {
        return isFigureOfMen;
    }

}

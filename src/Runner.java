import java.util.Collections;
import java.util.Comparator;

public class Runner {
    public static void main(String[] args) {
        Toy toy = new Round("кружок", Color.RED);
        Figure dedMoroz = new Figure("дуд мороз", Color.RED, true);
        Star star1 = new Star("везда", Color.WHITE);
        Toy star2 = new Star("звезда 2", Color.BLACK);

        Elka elka = new Elka("елка");
        elka.addToy(toy);
        elka.addToy(star1);
        elka.addToy(star2);

        System.out.println(elka.countToysOfColor(Color.BLACK));
        System.out.println(elka.countToysOfColor(Color.RED));

        Collections.sort(elka.getToys());

        Comparator<Toy> colorsComparator = new Comparator<Toy>() { //ручное сравнение

            @Override
            public int compare(Toy o1, Toy o2) {

                if (o1 == null && o2 == null){
                    return 0;
                }
                if (o1 != null && o2 == null){
                    return 1;
                }
                if (o1 == null && o2 != null){
                    return -1;
                }
                return o1.getColor().compareTo(o2.getColor());
            }

        };
        Collections.sort(elka.getToys(), colorsComparator);


    }
}

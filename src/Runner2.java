public class Runner2 {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.justPrint();

        Iout paperPrint = new Iout() {  // анонимный класс
            @Override
            public void justPrint() {
                System.out.println("paper prints");
            }
        };
        paperPrint.justPrint();
    }
}

package EncapsulationChallenge;

public class Main {
    public static void main(String[] args) {

        System.out.println("********PRINTER 1******************");
        Printer printer = new Printer(50, false);
        System.out.println("initial page count = " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(5);
        System.out.printf("Current Job Pages: %d, Printer Total: %d %n", pagesPrinted, printer.getPagesPrinted());
        pagesPrinted = printer.printPages(10);
        System.out.printf("Current Job Pages: %d, Printer Total: %d %n", pagesPrinted, printer.getPagesPrinted());

        System.out.println("********PRINTER 2******************");
        Printer printer2 = new Printer(50, true);
        System.out.println("initial page count = " + printer2.getPagesPrinted());
        int pagesPrinted2 = printer2.printPages(5);
        System.out.printf("Current Job Pages: %d, Printer Total: %d %n", pagesPrinted2, printer2.getPagesPrinted());
        pagesPrinted2 = printer2.printPages(10);
        System.out.printf("Current Job Pages: %d, Printer Total: %d %n", pagesPrinted2, printer2.getPagesPrinted());
    }
}
